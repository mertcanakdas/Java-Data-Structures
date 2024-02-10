package bagliliste;

import bagliliste.Node;

public class BagliListe {

    Node head;
    int es;
    Node tail;

    public BagliListe() {
        this.head = null;
        this.es = 0;
        this.tail = null;
    }

    public void prepend(Node n) {
        if (head == null) {
            tail = n;
        } else {
            n.next = head;
        }
        head = n;

    }

    public void addToLast(Node n) {
        if (head == null) {
            head = n;
        } else {
            tail.next = n;
            n.next = null;
        }
        tail = n;

    }

    public void deleteToPrepend() {
        if (head != null) {
            if (head == tail) {
                head = null;
                tail = null;
            } else {
                head = head.next;
            }
        } else {
            System.out.println("Liste boş");
        }
    }

    public void deleteToLast() {
        if (head == null) {
            System.out.println("Liste boş");
        } else if (head == tail) {
            head = null;
            tail = null;
        } else {
            Node tmp = head;
            while (tmp.next != tail) {
                tmp = tmp.next;

            }
            tmp.next = null;
            tail = tmp;
        }

    }

//    public void delete(int d) {
//        if (head == null) {
//            System.out.println("Liste boş");
//        } else if (head.data == d) {
//            head = head.next;
//        } else {
//            Node tmp = head;
//
//            while (tmp != null) {
//                if (tmp.next.data == d) {
//                    tmp.next = tmp.next.next;
//                }
//                if (tmp.next == null && last.data == d) {
//                    tmp.next = null;
//                }
//                tmp = tmp.next;
//
//            }
//        }
//    }
//
//    public void addInOrder(Node n) {
//        if (head == null) {
//            head = n;
//        } else if (head.data > n.data) {
//            n.next = head;
//            head = n;
//        } else {
//            Node tmp = head;
//            while (tmp.next != null && tmp.next.data < n.data) {
//                tmp = tmp.next;
//                if (tmp.next == null) {
//                    last = tmp;
//
//                }
//            }
//            n.next = tmp.next;
//            tmp.next = n;
//
//        }
//
//    }
    public void add(Node n) {
        if (head == null) {
            head = n;
        } else {
            Node tmp = head;
            while (tmp.next != null) {
                tmp = tmp.next;
            }
            tmp.next = n;
        }
    }

    public void print() {

        Node tmp = head;
        while (tmp != null) {
            System.out.print(tmp.data + "-");
            tmp = tmp.next;
        }
        System.out.println();
    }

}
