package Collections;

import java.util.ArrayList;

public class ConvertToArray {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();

        al.add("Sai");
        al.add("Ram");
        al.add("manoj");
        al.add("pusala");

        Object[] array =  al.toArray();

        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
}
