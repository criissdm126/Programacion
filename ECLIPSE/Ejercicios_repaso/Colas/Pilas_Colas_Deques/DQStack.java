package Pilas_Colas_Deques;
import java.util.Stack;
import java.util.Queue;

public class DQStack implements Stack {
    private Dqueue data;

    public DQStack() {
        data = new DLDqueue();
    }

    public void push(Object obj) {
        data.insertFirst(obj);
    }

    public Object pop() {
        return data.removeFirst();
    }

    public int size() {
        return data.size();
    }
}