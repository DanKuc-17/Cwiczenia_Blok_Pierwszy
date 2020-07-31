package ZadTrzeci;

public class Firma {

    public static void main (String[] args) {
        Pracownik pracownik1 = new Pracownik("Kowalski");
        System.out.println("Imię: " + pracownik1.imię + ".  Nazwisko: " +
                pracownik1.nazwisko + ".  Wiek: " + pracownik1.wiek);
        Pracownik pracownik2 = new Pracownik("Okruch", 25);
        System.out.println("Imię: " + pracownik2.imię + ".  Nazwisko: " +
                pracownik2.nazwisko + ".  Wiek: " + pracownik2.wiek);
        Pracownik pracownik3 = new Pracownik("Ewa", "Kmieć", 32);
        System.out.println("Imię: " + pracownik3.imię + ".  Nazwisko: " +
                pracownik3.nazwisko + ".  Wiek: " + pracownik3.wiek);
        System.out.println();
        Pracownik[] pracownik = new Pracownik[3];
        String[] imię = {"Adam", "Karol", "Ewa"};
        String[] nazwisko = {"Kowalski", "Okruch", "Kmieć"};
        int[] wiek = {40, 25, 32};
        for (
                int i = 0; i < pracownik.length; i++) {
            pracownik[i] = new Pracownik(imię[i], nazwisko[i], wiek[i]);
            System.out.println("Imię: " + pracownik[i].imię + ".  Nazwisko: " +
                    pracownik[i].nazwisko + ".  Wiek: " + pracownik[i].wiek);
        }
    }
}

