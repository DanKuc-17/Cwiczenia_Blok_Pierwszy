package Pierwsze;

import java.util.Scanner;

public class InkDek {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe");
        int liczba = scanner.nextInt();
        int liczba2 = liczba;
        System.out.println("+1: " + ++liczba);
        System.out.println("-1: " + --liczba2);

    }
}
