package LinkedList;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
	
    public static void main(String[] args) {
    	
        List<String> linkedList = new LinkedList<>();

        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");

        System.out.println("LinkedList:");
        for (String element : linkedList) {
            System.out.println(element);
        }
    }
}
