package PRACTICE.DataStructures.Stack;

import java.util.Stack;

public class Queue {
    static Stack<Integer> stack1 = new Stack<>();
    static Stack<Integer> stack2 = new Stack<>();

    public static void enQueue(int x){
        while(!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        stack1.push(x);

        while (!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
    }

    public static int deQueue(){
        if(stack1.isEmpty()){
            System.out.println("Queue is empty");
            System.exit(0);
        }
        int x = stack1.peek();
        stack1.pop();
        return x;

    }

    public static void main(String args[]){
        Queue q = new Queue();
        q.enQueue(1);
        q.enQueue(2);
        q.enQueue(3);

        System.out.println(q.deQueue());
        System.out.println(q);
    }

}
