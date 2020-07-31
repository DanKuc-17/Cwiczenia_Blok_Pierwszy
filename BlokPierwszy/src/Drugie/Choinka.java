package Drugie;

import java.util.Scanner;

public class Choinka {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wysokość choinki ");
        int wysokosc = scanner.nextInt();

        for(int i=0; i<wysokosc; i++){
            for(int j=0; j<=wysokosc*2; j++){
                if (j<(wysokosc-i)||(j>(wysokosc+i))) {
                System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
