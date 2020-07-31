package pl;

public class Main {
    public void add(int... num){
        int counter = 0;

        for(int number : num){
            counter ++;
        }
        System.out.println(counter);
    }

    public static void main(String[] args){

        Main main = new Main();
        main.add(2,4,6,78,9,4,2,5);
    }
}

