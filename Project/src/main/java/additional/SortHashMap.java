package additional;
import java.util.*;

public class SortHashMap {

    public static void main(String[] args) {

        HashMap<String, Integer> unsortedMap = new HashMap<>();
        unsortedMap.put("Hari", 30);
        unsortedMap.put("Anu", 25);
        unsortedMap.put("Sam", 35);



        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(unsortedMap.entrySet());


        Collections.sort(entryList, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> entry1, Map.Entry<String, Integer> entry2) {
                return entry1.getKey().compareTo(entry2.getKey());
            }
        });


        LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : entryList) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }


        System.out.println("Sorted Map based on keys:");
        for (Map.Entry<String, Integer> entry : sortedMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
