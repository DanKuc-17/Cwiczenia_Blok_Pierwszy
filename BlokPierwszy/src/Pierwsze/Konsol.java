package Pierwsze;

import java.util.Scanner;

public class Konsol {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj imie: ");
        String Name = scanner.next();
        System.out.println("Podaj wiek: ");
        int Age = scanner.nextInt();
        System.out.println("Imię: " + Name + "\n" + "Wiek: " + Age);
    }
}