
package datascructures;

import java.util.Arrays;


public class Stack {
   int[] q;
    int es;

    public Stack(int size) {
        q = new int[size];
        es = 0;
    }

    public void push(int e) {
        if (es == q.length) {
            System.out.println("Yığın dolu");
        } else {
            q[es++] = e;
        }

    }

    public int pop() {
        int r = q[es-1];
        
       q[--es] =0;
       
        return r;
    }

    public void print() {
        System.out.println(Arrays.toString(q));
    }

    public static void main(String[] args) {
        Stack d = new Stack(10);
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
