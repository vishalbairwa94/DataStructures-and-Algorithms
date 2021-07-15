package PRACTICE.DataStructures.practice;

public class GFG {
    static Node root;

    static void inorder(Node node){
        if(node == null)
            return;

        inorder(node.left);
        System.out.print(node.key + " ");
        inorder(node.right);
    }

    static void printinOrder(){
        inorder(root);
    }

    public static void main(String args[]){
        GFG tree = new GFG();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        printinOrder();


    }
}
