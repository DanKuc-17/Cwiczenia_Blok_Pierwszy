package JAVA_ex1_SDA;

public class ex9 {
    /*public static float myModulo(int number, int mod){
        System.out.println("number: " + number + " mod: " + mod + ":");
        float realNum = (float) number/mod;
        System.out.println("test real: " + realNum);
        return realNum;
    }*/
    public static int myModulo(int number, int mod){
        System.out.println("number: " + number + " mod: " + mod + ":");
        int total = (int) number/mod;
        System.out.println("test total: " + total);
        float realNum = (float) number/mod;
        System.out.println("test real: " + realNum);
        System.out.print("\n");
        return number - (total * mod);
    }

    public static void main(String[] args){
        int number = 3;
        int mod = 4;
        myModulo(number, mod);
    }
}
