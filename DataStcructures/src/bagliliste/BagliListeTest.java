package bagliliste;

public class BagliListeTest {

    public static void main(String[] args) {
        BagliListe bl = new BagliListe();
        CiftYönlüBagliListe cl = new CiftYönlüBagliListe();
        Node n1 = new Node(4);
        Node n2 = new Node(8);
        Node n3 = new Node(14);
        Node n4 = new Node(26);
        Node n5 = new Node(12);
        

        cl.prepend(n1);
        cl.print();
        cl.prepend(n2);
        cl.print();
        cl.prepend(n3);
        cl.print();
        cl.prepend(n4);
        cl.print();
        cl.prepend(n5);
        cl.print();
        
        
        cl.deleteToLast();
        cl.print();
        cl.deleteToLast();
        cl.print();
        cl.deleteToLast();
        cl.print();
        cl.deleteToLast();
        cl.print();
        cl.deleteToLast();
        cl.print();
        cl.deleteToLast();
        cl.print();
    }

}
