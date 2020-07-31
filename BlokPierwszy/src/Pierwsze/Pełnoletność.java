package Pierwsze;

import java.util.Scanner;

public class Pełnoletność {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj swój wiek: ");
        int wiek = scanner.nextInt();

        if (wiek >= 18) {
            System.out.println("Użytkownik pełnoletni");
        } else {
            System.out.println("Użytkownik niepełnoletni");
        }
    }
}
