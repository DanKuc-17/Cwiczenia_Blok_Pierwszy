package Drugie;

import java.util.Scanner;

public class WhileLiczbaCał {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe całkowitą");
        int liczba = scanner.nextInt();
        int i = 1;

        while (i<liczba){
            if (i%2==1){
                System.out.print(i + " ");
            }
            i++;
        }
    }
}
