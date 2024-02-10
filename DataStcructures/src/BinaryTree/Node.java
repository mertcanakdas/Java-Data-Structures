
package BinaryTree;

import jdk.nashorn.api.tree.BreakTree;


public class Node {
    int data;
    Node left,right;

    public Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }

    @Override
    public String toString() {
        
        return "Node{" + "data=" + data + ", left=" + left + ", right=" + right + '}';
        
    }
    
    
    
}
