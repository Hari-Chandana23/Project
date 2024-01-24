package Collections;

import java.util.ArrayList;

public class ConvertToArray {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();

        al.add("Hari");
        al.add("Chandana");
        al.add("Erla");


        Object[] array =  al.toArray();

        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
}
