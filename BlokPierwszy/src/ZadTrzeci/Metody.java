package ZadTrzeci;

public class Metody {

    public int wiek(){
        return 17;
    }
    public String imie(){
        return "Daniel";
    }

    public void obliczenia(int num1, int num2){
        System.out.println("Suma: " + (num1+num2));
        System.out.println("Różnica: " +(num1-num2));
        System.out.println("Iloczyn: " + (num1*num2));
    }

    public boolean tr(int num){
        return num%2==0;
    }

    public boolean podz(int num){
        return num%3==0 && num%5==0;
    }

}