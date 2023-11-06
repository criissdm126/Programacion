package Deques;

public class DNode {
    private Object data;
    private DNode prev;
    private DNode next;

    public DNode(Object data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }

    public Object getData() {
        return data;
    }

    public DNode getPrev() {
        return prev;
    }

    public void setPrev(DNode prev) {
        this.prev = prev;
    }

    public DNode getNext() {
        return next;
    }

    public void setNext(DNode next) {
        this.next = next;
    }
}
