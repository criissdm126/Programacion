package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
	
    public static void main(String[] args) {
    	
        Queue<String> queue = new LinkedList<>();

        queue.offer("Apple");
        queue.offer("Banana");
        queue.offer("Orange");

        System.out.println("Queue:");
        while (!queue.isEmpty()) {
            String element = queue.poll();
            System.out.println(element);
        }
    }
}

