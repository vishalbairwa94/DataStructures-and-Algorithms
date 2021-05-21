package PRACTICE.HackerRank;

import java.util.ArrayList;
import java.util.List;

public class SubarrayDivision {

    static int birthday(List<Integer> s, int d, int m) {

        int count = 0;
        int n = s.size();

        if(s.size() == 1 && m == 1 && d==s.get(0)){
            return 1;
        }
        for(int i=0; i<n-2; i++){
            List<Integer> temp = s.subList(i, i +(m-1)+1);
            int sum = 0;
            for(int j = 0; j<temp.size(); j++){
                sum = sum + temp.get(j);
            }
            if(sum == d){
                count++;
            }

        }

        return count;
    }

    public static void main(String[] args){
        List<Integer> s = new ArrayList<>();
        int[] arr = {2, 5, 1, 3, 4, 4, 3, 5, 1, 1, 2, 1, 4, 1, 3, 3, 4, 2, 1};
        for(int i =0; i<arr.length; i++){
            s.add(arr[i]);
        }
        System.out.println(birthday(s, 18,7));
    }
}
