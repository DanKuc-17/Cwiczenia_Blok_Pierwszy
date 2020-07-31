package Drugie;

import java.util.Scanner;

public class WhileLiczbyNiesk {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int liczba;
        int i = 0;

        do {
            System.out.println("Podaj liczbę");
            liczba = scanner.nextInt();
            i = i + liczba;
        } while (liczba!=0);

        System.out.print(i);
    }
}

