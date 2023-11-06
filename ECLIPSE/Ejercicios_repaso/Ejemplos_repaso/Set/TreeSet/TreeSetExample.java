package TreeSet;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
	
    public static void main(String[] args) {
    	
        Set<String> set = new TreeSet<>();

        set.add("Apple");
        set.add("Banana");
        set.add("Orange");
        set.add("Apple"); // No se agregará, ya que es un duplicado

        System.out.println("TreeSet:");
        for (String element : set) {
            System.out.println(element);
        }
    }
}

