package PRACTICE.HackerRank;

import java.util.ArrayList;
import java.util.List;

public class IceCreamParlor {
    public static List<Integer> icecreamParlor(int m, List<Integer> arr) {
        // Write your code here
        List<Integer> result = new ArrayList<>();
        int n = arr.size();
        for(int i = 0; i<n; i++){
            for(int j =n-1; j>i; j--){
                if(arr.get(i) + arr.get(j) == m){
                    result.add(i+1);
                    result.add(j+1);
                    break;
                }
            }
        }

        return result;

    }

    public static void main(String[] args){
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(4);
        arr.add(5);
        arr.add(3);
        arr.add(2);

        System.out.println(icecreamParlor(4, arr));

    }
}
