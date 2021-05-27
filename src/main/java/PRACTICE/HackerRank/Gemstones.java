package PRACTICE.HackerRank;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

public class Gemstones {

    public static int gemstones(List<String> arr) {
        // Write your code here
        int minSize = Integer.MAX_VALUE;
        String minString = null;
        for(String each: arr){
            if(each.length() < minSize){
                minString = each;
            }
        }
        Set<Character> uniqueAlpha = new HashSet<>();
        for(int i = 0; i<minString.length(); i++){
            uniqueAlpha.add(minString.charAt(i));
        }

        List<String> uniqueChars = new ArrayList<>();
        uniqueChars.addAll(uniqueChars);

        int count = 0;
        int result = 0;
        for(Character each : uniqueAlpha){
            for(String eachWord : arr){
                if(eachWord.contains(each.toString())){
                    count++;
                }
            }
            if(count == arr.size()){
                result++;
            }
            count = 0;
        }



        return result;




    }

    public static void main(String[] args){
        List<String> arr = new ArrayList<>();
        arr.add("abc");
        arr.add("abc");
        arr.add("bc");
        System.out.println(gemstones(arr));

    }

}
