package PRACTICE.DynamicProgramming;

public class Febonacci {


    final static int MAX = 100;
    final static int NIL = -1;
    public static int lookup[] = new int[MAX];

    public static void initialize(){
        for (int i = 0; i < MAX; i++){
            lookup[i] = NIL;
        }
    }
    public static int febo(int n){
        if(lookup[n]==NIL){
            if (n <= 1){
                lookup[n] = n;
            }
            else{
                lookup[n] = febo(n-1) + febo(n-2);
            }
        }
        return lookup[n];
    }

    public static void main(String args[]){
        int n = 5;
        initialize();
        System.out.println(febo(n));
    }

}
