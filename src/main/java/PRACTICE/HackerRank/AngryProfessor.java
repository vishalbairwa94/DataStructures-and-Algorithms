package PRACTICE.HackerRank;

import java.util.ArrayList;
import java.util.List;

public class AngryProfessor {

    public static String angryProfessor(int k, List<Integer> a) {
        // Write your code here
        int count = 0;
        for(Integer each : a){
            if(each <= 0){
                count++;
            }

        }
        if(count >= k){
            return "YES";
        }
        else{
            return "NO";
        }
    }

    public static void main(String[] args){
        int[] a = {-1, -3, 4, 2};
        List<Integer> ar = new ArrayList<>();
        for(int i=0; i<a.length; i++){
            ar.add(a[i]);
        }
        System.out.println(angryProfessor(3, ar));
    }
}
