package PriorityQueue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {
	
    public static void main(String[] args) {
    	
        Queue<String> priorityQueue = new PriorityQueue<>();

        priorityQueue.offer("Apple");
        priorityQueue.offer("Banana");
        priorityQueue.offer("Orange");

        System.out.println("PriorityQueue:");
        while (!priorityQueue.isEmpty()) {
            String element = priorityQueue.poll();
            System.out.println(element);
        }
    }
}

