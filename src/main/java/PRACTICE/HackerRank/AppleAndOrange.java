package PRACTICE.HackerRank;

import java.util.ArrayList;
import java.util.List;

public class AppleAndOrange {

    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples,List<Integer> oranges){
        int appleCount = 0;
        int orangeCount = 0;
        List<Integer> appleDistance = new ArrayList<>();
        List<Integer> orangeDistance = new ArrayList<>();

        for(Integer app : apples){
            appleDistance.add(a + app);
        }

        for(Integer or : oranges){
            orangeDistance.add(b + or);
        }

        for(Integer appD : appleDistance){
            if(appD >= s && appD <= t){
                appleCount++;
            }
        }for(Integer orrD : orangeDistance){
            if(orrD >= s && orrD <= t){
                orangeCount++;
            }
        }

        System.out.println(appleCount);
        System.out.println(orangeCount);
    }

    public static void main(String args[]){
        List<Integer> apples = new ArrayList<>();
        List<Integer> oranges = new ArrayList<>();

        apples.add(-2);
        apples.add(2);
        apples.add(1);

        oranges.add(5);
        oranges.add(-6);

        countApplesAndOranges(7, 11, 5, 15, apples, oranges);
    }
}
