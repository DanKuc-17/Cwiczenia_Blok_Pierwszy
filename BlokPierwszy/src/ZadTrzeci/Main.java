package ZadTrzeci;

public class Main {

    public static void main(String[] args){
       Pracownik pracownik1 = new Pracownik("Jan", "Kowalski", 45);

       // pracownik1.wyswietlDane(); //

        Metody metoda1 = new Metody();
       /* System.out.println(metoda1.imie());
        System.out.println(metoda1.wiek()); */

        metoda1.obliczenia(3,5);

        System.out.println(metoda1.tr(7));
        System.out.println(metoda1.podz(15));

        System.out.println(PoleKola.pole(5));
    }
}
