package LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {
	
    public static void main(String[] args) {
    	
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();

        linkedHashMap.put("Apple", 3);
        linkedHashMap.put("Banana", 5);
        linkedHashMap.put("Orange", 2);

        System.out.println("LinkedHashMap:");
        for (Map.Entry<String, Integer> entry : linkedHashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
