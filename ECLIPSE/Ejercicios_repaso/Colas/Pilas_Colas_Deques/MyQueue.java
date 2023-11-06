package Pilas_Colas_Deques;

public class MyQueue implements Queue {
    private Dqueue data;

    public MyQueue() {
        data = new DLDqueue();
    }

    public void enqueue(Object obj) {
        data.insertLast(obj);
    }

    public Object dequeue() {
        return data.removeFirst();
    }

    public int size() {
        return data.size();
    }
}