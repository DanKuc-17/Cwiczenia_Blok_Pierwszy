package Kwadraty;

import java.util.Scanner;

public class Main {

    public static void main (String[] args){
/*
        Scanner scanner = new Scanner(System.in);
        Square square1 = getSquare(scanner, "Podaj współrzędne punktu i długość boku pierwszego kwadratu");
        Square square2 = getSquare(scanner, "Podaj współrzędne punktu i długość boku drugiego kwadratu ");
        System.out.println(square1.covered(square2));*/

        Square square1 = new Square(new Point(2,10),4);
        Square square2 = new Square(new Point(1,4),3);
        System.out.println(square1.covered(square2));

    }
    private static Square getSquare(Scanner scanner, String message){
        System.out.println(message);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int length = scanner.nextInt();
        return new Square(new Point(x,y), length);
    }
}
