package PRACTICE.DataStructures.Stack;

public class Stack {
    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX];

    boolean isEmpty(){
        return (top < 0);
    }

    Stack(){
        top = -1;
    }

    boolean push(int x){
        if(top >= (MAX-1)){
            System.out.println("Styack overflow");
            return false;
        }
        else{
            a[++top] = x;
            System.out.println("Added to stack");
            return true;
        }
    }

    int pop(){
        if(top < 0){
            System.out.println("Stack overflow");
            return 0;
        }
        else{
            int x = a[top++];
            return x;
        }
    }
    int peak(){
        if(top < 0){
            System.out.println("Stack overflow");
            return 0;
        }
        else{
            int x = a[top];
            return x;
        }
    }
    void printStack(){
        int len = a.length;
        for(int i=0; i<len;i++){
            System.out.print(a[i]);
        }
    }

    public static void main(String args[]){
        Stack stack = new Stack();
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.printStack();
    }
}
