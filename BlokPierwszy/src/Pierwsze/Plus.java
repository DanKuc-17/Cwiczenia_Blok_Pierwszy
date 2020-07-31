package Pierwsze;

import java.util.Scanner;

public class Plus {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwsza liczbe: ");
        int pierwsza = scanner.nextInt();
        System.out.println("Podaj druga liczbe: ");
        int druga = scanner.nextInt();

        System.out.println("wynik dodawania: " + (pierwsza + druga));
    }
}