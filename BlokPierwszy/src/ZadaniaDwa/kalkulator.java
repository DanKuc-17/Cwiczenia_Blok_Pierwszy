package ZadaniaDwa;

import javax.swing.*;
import java.util.Scanner;

public class kalkulator {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        for (;;) {
            System.out.println("Podaj pierwszą liczbę: ");
            int a = scanner.nextInt();
            System.out.println("Podaj drugą liczbę: ");
            int b = scanner.nextInt();
            System.out.println("Wybierz rodzaj dziaania jakie chcesz wykonać");
            String dzialanie = scanner.next();
            int c=0;

            switch (dzialanie){
                case "+":
                    c=a+b;
                    System.out.println("Wynik: " + c);
                    break;
                case "-":
                    c=a-b;
                    System.out.println("Wynik: " + c);
                    break;
                case "*":
                    c=a*b;
                    System.out.println("Wynik: " + c);
                case "/":
                    if (b!=0){
                        c=a/b;
                        System.out.println("Wynik: " + c);
                    } else {
                        System.out.println("Pierwsza liczba jest nie podziena przez drugą");
                    }
            }
        }
    }
}
