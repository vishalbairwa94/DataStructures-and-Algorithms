package PRACTICE;

import java.sql.SQLOutput;

public class Recursion {
    public static void main(String args[]){
        permutation("abc", 0, 2);

    }

    public static void permutation(String s, int l, int r){
        if (l == r){
            System.out.println(s);
            return;
        }
        for (int i = l; i <=r; i++){
        s = interchange(s, l, i);
        permutation(s, l+1, r);
        s = interchange(s, l, i);
        }
    }

    public static String interchange(String s, int a, int b){
        char array[] = s.toCharArray();
        char temp = array[a];
        array[a] = array[b];
        array[b] = temp;

        return String.valueOf(array);
    }
}
