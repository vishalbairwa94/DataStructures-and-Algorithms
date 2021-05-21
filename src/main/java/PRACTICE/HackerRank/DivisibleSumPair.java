package PRACTICE.HackerRank;

import java.util.ArrayList;
import java.util.List;

public class DivisibleSumPair {
    public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
        // Write your code here
        int count = 0;
        for(int i = 0; i<n-1;i++){
            for(int j = i+1; j<n;j++){
                if((ar.get(i)+ar.get(j)) % k == 0){
                    count++;
                }
            }
        }
        return count;

    }

    public static void main(String[] args){
        int[] a = {1, 3, 2, 6, 1, 2};
        List<Integer> ar = new ArrayList<>();
        for(int i =0; i<a.length; i++){
            ar.add(a[i]);
        }
        System.out.println(divisibleSumPairs(6, 3, ar));
    }
}
