package Pierwsze;

import java.util.Scanner;

public class Pesel {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.print("Podaj pesel \n");
            long pesel = scanner.nextLong();

            if (pesel % 2 == 0) {
                System.out.println("pesel jest parzysty");
            } else {
                System.out.println("pesel jest nieparzysty");
            }
        }

}
