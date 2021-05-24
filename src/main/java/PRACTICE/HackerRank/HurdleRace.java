package PRACTICE.HackerRank;

import java.util.ArrayList;
import java.util.List;

public class HurdleRace {

    public static int hurdleRace(int k, List<Integer> height) {
        // Write your code here
        int max= 0;
        int potion = 0;
        for(Integer each : height){
            if(each>max){
                max = each;
            }
        }
        if(max < k){
            return 0;
        }
        else{
            potion = max - k;
        }

        return potion;


    }

    public static void main(String[] args){
        List<Integer> ar = new ArrayList<>();
        ar.add(2);
        ar.add(5);
        ar.add(4);
        ar.add(5);
        ar.add(2);

        System.out.println(hurdleRace(7, ar));

    }
}
