package HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
	
    public static void main(String[] args) {
    	
        Map<String, Integer> hashMap = new HashMap<>();

        hashMap.put("Apple", 3);
        hashMap.put("Banana", 5);
        hashMap.put("Orange", 2);

        System.out.println("HashMap:");
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
