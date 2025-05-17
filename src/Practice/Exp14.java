package Practice;

import java.util.*;

/*
 Fill a HashMap with key-value pairs. Print the results to show ordering by hash code. Extract the
pairs, sort by key, and place the result into a LinkedHashMap. Show that the insertion order is maintained.
 */
public class Exp14 {

    public static void main(String[] args){

        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Banana",2);
        hashMap.put("Apple",5);
        hashMap.put("Mango",3);
        hashMap.put("Orange",4);

        System.out.println("Original Hashmap (Unordered): ");
        for( Map.Entry<String, Integer> entry : hashMap.entrySet()){
            System.out.println(entry.getKey() + "->" + entry.getValue());
        }

        List<Map.Entry<String, Integer>> entries = new ArrayList<>(hashMap.entrySet());
        entries.sort(Map.Entry.comparingByKey());

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : entries){
            linkedHashMap.put(entry.getKey(),entry.getValue());
        }

        System.out.println("LinkedHashMap sorted by key : ");
        for (Map.Entry<String, Integer> entry : linkedHashMap.entrySet()){
            System.out.println(entry.getKey() + "->" + entry.getValue());
        }

    }
}
