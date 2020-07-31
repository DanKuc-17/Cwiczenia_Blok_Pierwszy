package JAVA_ex1_SDA;

public class ex4 {

    public static void printTable(int[] array){
        for (int element:array){
            System.out.print("(" + element + ")");
        }
        System.out.println("\n");
    }

    public static void switchTable(int[] table) {
        if (table.length >= 2) {
            System.out.println("table before: ");
            printTable(table);
            int tmp = table[0];
            int lastIndex = table.length - 1;
            table[0] = table[lastIndex];
            table[lastIndex] = tmp;
            System.out.println("after: ");
            printTable(table);
        } else {
            System.out.println("Ta tablica jest za mała");
        }
    }

        public static void main(String[] args){
        int [] array = {15,4,29};
        switchTable(array);
    }
}
