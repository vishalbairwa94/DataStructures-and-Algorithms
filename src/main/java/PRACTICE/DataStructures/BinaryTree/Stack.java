package PRACTICE.DataStructures.BinaryTree;

public class Stack {
    static final int MAX = 100;
    int top;
    int a[] = new int[MAX];

    public boolean isEmpty(){
        return (top < 0);
    }

    Stack(){
        top = -1;
    }

    public boolean push(int x){
        if(top >= (MAX-1)){
            System.out.println("stack overflow");
            return false;
        }
        else{
            a[++top] = x;
            System.out.println(x + " pushed to stack");
            return true;
        }

    }

    public int pop(){
        if(top < 0){
            System.out.println("Stack underflow");
            return 0;
        }
        else{
            int x = a[top--];
            return x;
        }
    }
    public int peek(){
        if(top<0){
            System.out.println("Stack underflow");
            return 0;
        }
        else{
            int x = a[top];
            return x;
        }
    }

    public static void main(String args[]){
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.pop() + " Popper from stack");
    }


}
