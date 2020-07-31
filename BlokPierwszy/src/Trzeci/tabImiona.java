package Trzeci;

public class tabImiona {

    public static void main(String[] args){

        String data = "";
        String[] names = {"Ania","Natalia","Patryk","Dawid","Asia"};

        for (String name:names) {
            data += name + ", ";
        }
        System.out.println(data);
    }
}