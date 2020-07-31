package Drugie;

public class SkróconyIf {

    public static void main(String[] args){

        int randomNr = (int)(Math.random() * 21);
        System.out.println(randomNr);

        String result = randomNr>10 ? "wyższa" : "mniejsza";
        System.out.println(result);
    }
}
