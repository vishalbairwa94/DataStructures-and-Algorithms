package PRACTICE;

public class Factorial {

    public static void main(String args[]){
        int n = 5;
        System.out.println(factorial(n));
    }

    public static int factorial(int n){
        if(n == 0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        return n * factorial(n-1);
    }
}
