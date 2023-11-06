package Deques;

public class Principal {

    public static void main(String[] args) {
    	
        DLDqueue deque = new DLDqueue();

        deque.insertFirst(1);
        deque.insertFirst(2);
        deque.insertLast(3);
        deque.insertLast(4);

        System.out.println(deque); // Imprime: head [ 2-1-3-4 ] tail

        Object removedItem = deque.removeFirst();
        System.out.println("Removed item: " + removedItem); // Imprime: Removed item: 2

        removedItem = deque.removeLast();
        System.out.println("Removed item: " + removedItem); // Imprime: Removed item: 4

        System.out.println("Size: " + deque.size()); // Imprime: Size: 2
    }
}