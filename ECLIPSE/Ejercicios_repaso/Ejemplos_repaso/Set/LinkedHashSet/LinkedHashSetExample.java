package LinkedHashSet;

import java.util.Set;
import java.util.LinkedHashSet;

public class LinkedHashSetExample {
	
    public static void main(String[] args) {
    	
        Set<String> set = new LinkedHashSet<>();

        set.add("Apple");
        set.add("Orange");
        set.add("Banana");
        set.add("Apple"); // No se agregará, ya que es un duplicado

        System.out.println("LinkedHashSet:");
        for (String element : set) {
            System.out.println(element);
        }
    }
}
