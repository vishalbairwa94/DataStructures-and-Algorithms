package PRACTICE.DataStructures.BinaryTree;

import java.util.Scanner;

public class Tree {
    static Scanner sc = null;
    public static void main(String args[]){
        sc = new Scanner(System.in);
        Node root = createTree();
        inOrder(root);
        System.out.println();
        preOrder(root);
        System.out.println();
        postOrder(root);
        System.out.println();


    }

    public static Node createTree(){
        Node root = null;
        System.out.println("Enter Data: ");
        int data = sc.nextInt();

        if(data==-1){
            return null;
        }

        root = new Node(data);

        System.out.println("Enter the left for " + data);
        root.left = createTree();

        System.out.println("Enter the right for " + data);
        root.right = createTree();

        return root;

    }

    public static void inOrder(Node root){
        if(root == null){
            return;
        }

        inOrder(root.left);
        System.out.println(root.data);
        inOrder(root.right);
    }

    public static void preOrder(Node root){
        if(root == null) return;

        System.out.println(root.data);
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void postOrder(Node root){
        if(root == null) return;

        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.data);
    }
}
