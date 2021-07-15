package PRACTICE.DataStructures.BinaryTree;

import java.util.Stack;

public class Stack1 {

    public static void stackPush(Stack<Integer> stack){
        for(int i = 0; i<5; i++){
            stack.push(i);
        }
    }

    public static void stackPop(Stack<Integer> stack){
        System.out.println("Pop operation");
        for(int i =0; i<5; i++){
            Integer y = (Integer) stack.pop();
            System.out.println(y);
        }
    }

    public static void stackPeek(Stack<Integer> stack){
        Integer element = (Integer) stack.peek();
        System.out.println("Element on stack top: " + element);
    }

    public static void searchElement(Stack<Integer> stack, int element){
        Integer pos = (Integer) stack.search(element);

        if(pos == -1){
            System.out.println("Element not found");
        }
        else {
            System.out.println("Element found at position " + pos);
        }
    }

    public static void main(String arg[]){
        Stack<Integer> stack = new Stack<>();
        stackPush(stack);
        stackPop(stack);
        stackPush(stack);
        stackPeek(stack);
        searchElement(stack, 2);
        searchElement(stack, 4);
    }
}
