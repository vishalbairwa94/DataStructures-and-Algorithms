package PRACTICE.DataStructures.BinaryTree;

public class TestTree {

    Node root;

    TestTree(int data){
        root = new Node(data);
    }

    TestTree(){
        root = null;
    }

    public static void inOrder(Node root){
        if(root == null) return;

        inOrder(root.left);
        System.out.print(root.data);
        inOrder(root.right);
    }

    public static void preOrder(Node root){
        if(root == null) return;

        System.out.print(root.data);
        inOrder(root.left);

        inOrder(root.right);
    }

    public static void postOrder(Node root){
        if(root == null) return;


        inOrder(root.left);
        inOrder(root.right);
        System.out.print(root.data);
    }

    public static void main(String args[]){
        TestTree tree = new TestTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        inOrder(tree.root);
        System.out.println();
        preOrder(tree.root);
        System.out.println();
        postOrder(tree.root);
        System.out.println();

    }


}
