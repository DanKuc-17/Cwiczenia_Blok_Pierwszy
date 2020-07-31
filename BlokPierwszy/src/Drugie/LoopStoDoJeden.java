package Drugie;

public class LoopStoDoJeden {

    public static void main(String[] args){

        for(int i=100; i>=1; i--){
            System.out.print(i + "     Liczba podzielna przez: ");
            if(i%2==0){
                System.out.print("2 ");
            }
            if(i%3==0){
                System.out.print("3 ");
            }
            if(i%5==0){
                System.out.print("5 ");
            }
            System.out.println();
        }
    }
}
