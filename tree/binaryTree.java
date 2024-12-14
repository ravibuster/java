import java.util.Scanner;

public class binaryTree {
    public static Node root;

    public static class Node {
        int val;
        Node left;
        Node right;

        Node(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    public static void populate(Scanner sc) {
        System.out.println("Enter the data of root node: ");
        int value = sc.nextInt();
        root = new Node(value);
        populate(sc, root);
    }

    public static void populate(Scanner sc, Node node) {
        System.out.println("Do you want to enter the left node of " + node.val + "? (true/false)");
        boolean left = sc.nextBoolean();
        if (left) {
            System.out.println("Enter the value of the left node: ");
            int value = sc.nextInt();
            node.left = new Node(value);
            populate(sc, node.left);
        }

        System.out.println("Do you want to enter the right node of " + node.val + "? (true/false)");
        boolean right = sc.nextBoolean();
        if (right) {
            System.out.println("Enter the value of the right node: ");
            int value = sc.nextInt();
            node.right = new Node(value);
            populate(sc, node.right);
        }
    }

    public static void display() {
        if (root == null) {
            System.out.println("Tree is empty");
            return;
        }
        System.out.println("In-order traversal of the tree:");
        display(root);
        System.out.println(); // To ensure output ends with a newline
    }

    public static void display(Node node) {
        if (node != null) {
            display(node.left);
            System.out.print(node.val + "\t");
            display(node.right);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        populate(sc);
        display();
    }
}
