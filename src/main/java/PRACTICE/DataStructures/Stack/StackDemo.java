package PRACTICE.DataStructures.Stack;

import java.util.Stack;

public class StackDemo {

    public static void main(String args[]){
        Stack stack1 = new Stack();
        stack1.push(4);
        stack1.push(5);
        stack1.push("Hello");

        Stack<String> stack2 = new Stack<>();
        stack2.add("hi");
        System.out.println(stack1);
        System.out.println(stack2);

        System.out.println(stack1.peek());
        System.out.println(stack1.pop());
        System.out.println(stack1);

        System.out.println(stack1.search(4));


    }
}
