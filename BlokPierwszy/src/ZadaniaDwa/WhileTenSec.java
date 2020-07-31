package ZadaniaDwa;

import java.util.Scanner;

public class WhileTenSec {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        long suma=0;
        long now = System.currentTimeMillis();
        System.out.println("Podwaja przez 10 skund liczby");

        while (System.currentTimeMillis() <= now + 10000){
            long a = scanner.nextLong();
            suma = suma + a;
        }
        System.out.println("Suma iczb podanych w ciągu 10 sekund: " + suma);
    }
}
