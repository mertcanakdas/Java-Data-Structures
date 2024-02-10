package datascructures;

import java.util.Arrays;

public class Queue {

    int[] q;
    int es;

    public Queue(int size) {
        q = new int[size];
        es = 0;
    }

    public void push(int e) {
        if (es == q.length) {
            System.out.println("Kuyruk dolu");
        } else {
            q[es++] = e;
        }

    }

    public int pop() {
        int r = q[0];

        for (int i = 0; i < es-1; i++) {
            q[i] = q[i + 1];
        }
        q[--es] = 0;
        return r;
    }

    public void print() {
        System.out.println(Arrays.toString(q));
    }

    public static void main(String[] args) {
        Queue d = new Queue(10);
        d.push(10);
        d.push(35);
        d.push(12);
        d.push(2);
        d.push(98);
        d.push(11);
        d.push(24);
        
        d.print();
        
        System.out.println(d.pop());
        System.out.println(d.pop());
        
        d.print();
    }

}
