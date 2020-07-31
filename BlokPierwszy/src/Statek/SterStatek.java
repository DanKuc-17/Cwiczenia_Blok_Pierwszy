package Statek;

import java.util.Scanner;

public class SterStatek {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int[][] board = new int[5][5];
        int currentPosRow,currentPosColumn;

        for(int row=0; row<board.length; row++){
            for(int column=0; column<board[row].length; column++){
                board[row][column]=0;
            }
        }
        currentPosRow = 2;
        currentPosColumn = 2;

        while (true) {
            board[currentPosRow][currentPosColumn]=1;

            for(int row=0; row<board.length; row++){
                for(int column=0; column<board[row].length; column++){
                    System.out.print(board[row][column] + " ");
                }
                System.out.println();
            }

            System.out.println("Podaj słownie lub skrótowo kierunek ");
            String kierunek = scanner.next();

            switch (kierunek) {
                case "góra":
                case "g":
                    System.out.println("^");
                    currentPosRow--;
                    break;
                case "dół":
                case "d":
                    System.out.println("v");
                    currentPosRow++;
                    break;
                case "lewo":
                case "l":
                    System.out.println("<");
                    currentPosColumn--;
                    break;
                case "prawo":
                case "p":
                    System.out.println(">");
                    currentPosColumn++;
                    break;
                default:
                    System.out.println("Niepoprawna komenda");
            }

            if(currentPosRow<0 || currentPosRow>4 || currentPosColumn<0 || currentPosColumn>4){
                System.out.println("statek wypadł :>");
                break;
            }
        }
    }
}
