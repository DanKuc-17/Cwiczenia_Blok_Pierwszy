package Trzeci.Pracownik;

public class Pracownik {
    String imie, nazwisko, datazatrudnienia;
    int wiek, wynagrodzenie;

    public Pracownik(String imie){
        this.imie = imie;
    }
    public Pracownik(String imie,String nazwisko){
        this.imie=imie;
        this.nazwisko=nazwisko;
    }

    public Pracownik(String imie, String nazwisko, String datazatrudnienia, int wiek, int wynagrodzenie) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.datazatrudnienia = datazatrudnienia;
        this.wiek = wiek;
        this.wynagrodzenie = wynagrodzenie;
    }

    public void pracuj(){
        System.out.println("osoba pracuje");
    }
    public void odpoczywaj(){
    }
}
