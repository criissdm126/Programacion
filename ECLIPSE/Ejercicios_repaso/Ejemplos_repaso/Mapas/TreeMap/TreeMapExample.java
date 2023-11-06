package TreeMap;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
	
    public static void main(String[] args) {
    	
        Map<String, Integer> treeMap = new TreeMap<>();

        treeMap.put("Apple", 3);
        treeMap.put("Banana", 5);
        treeMap.put("Orange", 2);

        System.out.println("TreeMap:");
        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
