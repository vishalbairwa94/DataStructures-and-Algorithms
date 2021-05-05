package PRACTICE;

public class Febonacci {

    public static void main(String args[]){
        int n = 5;
        for(int i = 0; i < n; i++ ){
            System.out.print(febo(i));
        }

    }

    public static int febo(int n){
        if (n == 0){
            return 0;
        }
        if (n == 1 || n == 2){
            return 1;
        }
        else{
            return febo(n-1) + febo(n-2);
        }
    }
}
