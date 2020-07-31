package ZwracaneDodaj;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Metody suma = new Metody();

        System.out.println(suma.dodaj(12,13));
        System.out.println(suma.dodaj(1.2F,1.4F));
        System.out.println(suma.dodaj(32454363463636L,3235436547457L));
        System.out.println(suma.dodaj(12.345,15.43566));
    }
}
