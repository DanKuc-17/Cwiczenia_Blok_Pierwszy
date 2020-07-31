package JAVA_ex1_SDA;

public class ex5 {

    public static void printTable(int[] array) {
        for (int element : array) {
            System.out.print("(" + element + ")");
        }
        System.out.println("\n");
    }

    public static void minMax(int[] table) {
        int min = table[0];
        int max = table[0];
        printTable(table);
        for (int i = 0; i < table.length; i++) {
            if (min > table[i]) {
                min = table[i];
            }
            if (max < table[i]){
                max = table[i];
            }
        }
        System.out.println("najmniejsza liczba w tym zbiorze to: " + min);
        System.out.println("największa liczba w tym zbiorze to: " + max);
    }
    public static void main(String[] args){
        int[] numbers = {14,35,23,89,67};
        minMax(numbers);
    }
}


