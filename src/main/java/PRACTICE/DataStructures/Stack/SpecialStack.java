package PRACTICE.DataStructures.Stack;

import java.util.Stack;

public class SpecialStack  extends Stack {
    Stack<Integer> min = new Stack<>();

    public void push(int x){
        if(isEmpty() == true){
            super.push(x);
            min.push(x);
        }
        else{
            super.push(x);
            int y = min.pop();
            min.push(y);
            if(x<y){
                min.push(x);
            }
            else{
                min.push(y);
            }
        }
    }

    public Integer pop(){
        int x = (int) super.pop();
        min.pop();
        return x;

    }

    int getMin(){
        int x = min.pop();
        min.push(x);
        return x;
    }
}
