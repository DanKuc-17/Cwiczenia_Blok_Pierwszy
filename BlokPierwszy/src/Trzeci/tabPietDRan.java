package Trzeci;

public class tabPietDRan {

    public static void main(String[] args){

        int[] tab = new int[15];

        for(int i=0; i < tab.length; i++) {
            tab[i] = (int) (Math.random() * 6);
        }
        for (int i=0; i < tab.length; i++){
            System.out.print(tab[i] + " ");
        }
        int[] wynik = {0,0,0,0,0,0};

        for (int i=0; i < tab.length; i++){
            int wartosc = tab[i];
            wynik[wartosc] ++;
        }
        for (int i=0; i < wynik.length; i++){
            System.out.println("\n" + "ilość wystąpień " + i  + ": " + wynik[i]);
        }
    }
}
