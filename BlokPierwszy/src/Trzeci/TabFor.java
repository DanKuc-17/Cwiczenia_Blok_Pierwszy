package Trzeci;

import java.util.Scanner;

public class TabFor {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int suma=0;
        System.out.println("podaj wielkość tablicy");
        int arraySize = scanner.nextInt();
        int[] tab = new int[arraySize];

        for (int i=0; i<tab.length; i++){
            tab[i] = (int)(Math.random()*10);
        }
        for (int i=0; i<tab.length; i++){
            System.out.print(tab[i] + " ");
        }
        for (int i=0; i<tab.length; i++){
            suma = suma + tab[i];
        }
        System.out.println("\n" + "suma elementów tablicy: " + suma);
        System.out.println("średnia elementów tablicy: " + ((double)suma/arraySize));
    }
}
