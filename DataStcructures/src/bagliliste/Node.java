package bagliliste;

public class Node {

    int data;
     Node next;
     Node prev;

    public Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }

    @Override
    public String toString() {
        return "[" + data + "," + next + ']';
    }

}
