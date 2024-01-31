package additional;import java.util.ArrayList;
import java.util.Collections;

public class ReverseArrayList {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        System.out.println("Original ArrayList: " + numbers);
        reverseArrayList(numbers);
        System.out.println("Reversed ArrayList: " + numbers);
    }
    private static void reverseArrayList(ArrayList<Integer> list) {

        Collections.reverse(list);
    }
}
