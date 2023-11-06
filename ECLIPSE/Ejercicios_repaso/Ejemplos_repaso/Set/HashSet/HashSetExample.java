package HashSet;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
	
    public static void main(String[] args) {
    	
        Set<String> set = new HashSet<>();

        set.add("Apple");
        set.add("Banana");
        set.add("Orange");
        set.add("Apple"); // No se agregará, ya que es un duplicado

        System.out.println("HashSet:");
        for (String element : set) {
            System.out.println(element);
        }
    }
}