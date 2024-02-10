package BinaryTree;

import com.sun.javadoc.RootDoc;

public class BinaryTree {

    Node root;

    public BinaryTree() {
        root = null;
    }

    public void insert(int a) {
        root = insertR(root, a);

    }

    private Node insertR(Node current, int a) {
        if (current == null) {
            current = new Node(a);
            return current;
        }
        if (current.data > a) {
            current.left = insertR(current.left, a);
        } else if (current.data < a) {
            current.right = insertR(current.right, a);
        }
        return current;
    }

    public Node search(int s) {
        return searchR(root, s);
    }

    private Node searchR(Node current, int s) {
        if (current == null || current.data == s) {
            return current;
        } else if (current.data > s) {
            return searchR(current.left, s);
        } else {
            return searchR(current.right, s);
        }
    }

    public void preOrder() {
        System.out.print("Preorder sıralama\t:\t");
        preOrderR(root);
        System.out.println();

    }

    private void preOrderR(Node current) {
        if (current != null) {
            System.out.print(current.data + "-");
            preOrderR(current.left);
            preOrderR(current.right);
        }
    }

    public void inOrder() {
        System.out.print("Inorder sıralama\t:\t");
        inOrderR(root);
        System.out.println();

    }

    private void inOrderR(Node current) {
        if (current != null) {
            inOrderR(current.left);
            System.out.print(current.data + "-");
            inOrderR(current.right);
        }

    }

    public void postOrder() {
        System.out.print("Postorder sıralama\t:\t");
        postOrderR(root);
        System.out.println();

    }

    private void postOrderR(Node current) {
        if (current != null) {
            inOrderR(current.left);
            inOrderR(current.right);
            System.out.print(current.data + "-");
        }
    }

    public void delete(int d) {
        deleteR(root, d);
    }

    private Node deleteR(Node current, int d) {
        if (current == null) {
            return current;
        }
        if (current.data > d) {
            current.left = deleteR(current.left, d);
        } else if (current.data < d) {
            current.right = deleteR(current.right, d);
        } else {
            if (current.left == null) {
                return current.right;
            } else if (current.right == null) {
                return current.left;
            } else {
                int leftmax = findMax(current.left);
                current.data = leftmax;
                current.left = deleteR(current.left, d);
            }
        }
        return current;
    }

    public int findMax(Node current) {
        int max = current.data;
        while (current != null) {
            max = current.data;
            current = current.right;
        }
        return max;
    }

    public void print() {
        printR(root, "");
    }

    private void printR(Node current, String indent) {
        System.out.println(indent + current.data);
        if (current.left != null) {
            printR(current.left, indent + "    ");
        }
        if (current.right != null) {
            printR(current.right, indent + "    ");
        }
    }

}
