package ZadTrzeci;

public class Pracownik {
    String imię;
    String nazwisko;
    int wiek;

    public Pracownik(String nazwisko) {
        this.nazwisko = nazwisko;
        imię = "brak";
        wiek = 0;
    }
    public Pracownik(int wiek) {
        imię = "brak";
        nazwisko = "brak";
        this.wiek = wiek;
    }
    public Pracownik(String nazwisko, int wiek) {
        imię = "brak";
        this.nazwisko = nazwisko;
        this.wiek = wiek;
    }
    public Pracownik(String imię, String nazwisko, int wiek) {
        this.imię = imię;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
    }

    public void wyswietlDane(){
        System.out.println("Dane pracownika: ");
        System.out.print(this.imię + ", ");
        System.out.print(this.nazwisko + ", ");
        System.out.println(this.wiek);
    }

    public String getImię() {
        return imię;
    }

    public void setImię(String imię) {
        this.imię = imię;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }
}
