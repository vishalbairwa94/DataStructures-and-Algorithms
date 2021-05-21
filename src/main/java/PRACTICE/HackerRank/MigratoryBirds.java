package PRACTICE.HackerRank;

import java.util.*;

public class MigratoryBirds {

    public static int migratoryBirds(List<Integer> arr) {
        // Write your code here
        final int[] maxBirdId = {0};
        final int[] maxValue = {0};
        HashSet<Integer> uniqueIds = new HashSet<>();
        HashMap idCountMap = new HashMap();
        Iterator itr = uniqueIds.iterator();
        for(Integer each : arr){
            uniqueIds.add(each);
        }
        Object[] uniqueArray = uniqueIds.toArray();
        for(int i=0; i<uniqueIds.size(); i++){
            int count = 0;
            int key = 0;
            for(Integer each : arr){
                if(uniqueArray[i] == each){
                    key = each;
                    count++;
                }
            }
            idCountMap.put(key, count);

        }
        idCountMap.forEach((key,value) -> {
            if(Integer.parseInt(value.toString()) >= maxValue[0]){
                maxValue[0] = Integer.parseInt(value.toString());
                maxBirdId[0] = Integer.parseInt(key.toString());
            }
        });

        idCountMap.forEach((key,value) -> {
            if(Integer.parseInt(value.toString()) == maxValue[0] && Integer.parseInt(key.toString()) < maxBirdId[0]){
                maxBirdId[0] = Integer.parseInt(key.toString());
            }
        });

        return maxBirdId[0];

        }

    public static void main(String[] args){
        int[] a = {1,1,2,2,3};
        List<Integer> arr = new ArrayList<>();
        for(int i =0; i<a.length; i++){
            arr.add(a[i]);
        }
        System.out.println(migratoryBirds(arr));

    }


}
