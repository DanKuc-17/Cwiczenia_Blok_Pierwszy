package KolkoKrzyz;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[][] board = new String[3][3];
        System.out.println("Wybierz czy chcesz grać X czy O");
        String choice = scanner.next();

        for (int row = 0; row < board.length; row++) {
            for (int column = 0; column < board[row].length; column++) {
                board[row][column] = "-";
            }
        }

        int posRowX, posColumnX, posRowO, posColumnO;

        do {

            switch (choice) {
                case "X":

                        posRowO = (int) (Math.random() * 3);
                        posColumnO = (int) (Math.random() * 3);

                        board[posRowO][posColumnO] = "O";


                    System.out.println("Podaj gdzie chcesz umieścić X");
                    posRowX = scanner.nextInt();
                    posColumnX = scanner.nextInt();

                    board[posRowX][posColumnX] = "X";

                    for (int row = 0; row < board.length; row++) {
                        for (int column = 0; column < board[row].length; column++) {
                            System.out.print(board[row][column] + " ");
                        }
                        System.out.println();
                    }
                    break;

                case "O":

                    System.out.println("Podaj gdzie chcesz umieścić O");
                    posRowO = scanner.nextInt();
                    posColumnO = scanner.nextInt();

                    board[posRowO][posColumnO] = "O";

                    posRowX = (int) (Math.random() * 3);
                    posColumnX = (int) (Math.random() * 3);

                    board[posRowX][posColumnX] = "X";

                    for (int row = 0; row < board.length; row++) {
                        for (int column = 0; column < board[row].length; column++) {
                            System.out.println(board[row][column] + " ");
                        }
                        System.out.println();
                    }
            }
        } while (true);
    }
}