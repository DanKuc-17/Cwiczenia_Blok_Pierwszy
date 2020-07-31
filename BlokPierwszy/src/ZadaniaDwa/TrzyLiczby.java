package ZadaniaDwa;

import java.util.Scanner;

public class TrzyLiczby {

    public static void main(String[] args){

        int c=0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj pierwszą liczbę: ");
        int a = scanner.nextInt();
        System.out.println("Podaj drugą liczbę: ");
        int b = scanner.nextInt();

        c=a+b;

        for(int i=1; i<=c; i++){
            System.out.println("Obliczenia");
        }
    }
}
