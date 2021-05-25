package PRACTICE.HackerRank;

import java.util.*;

public class WeightedUniformString {

    public static List<String> weightedUniformStrings(String s, List<Integer> queries) {
        // Write your code here
        List<String> result = new ArrayList<>();
        List<Integer> weight = new ArrayList<>();
        Set<Character> uniqueChars = new HashSet();
        for(int i = 0; i<s.length(); i++) {
            uniqueChars.add(s.charAt(i));
        }

        String alpha = "abcdefghijklmnopqrstuvwxyz";
        HashMap<Character, Integer> charNumMap = new HashMap<>();

        for(int i=0; i< alpha.length(); i++){
            charNumMap.put(alpha.charAt(i), i+1);
        }

        HashMap<Character, Integer> charCount = new HashMap<>();

        uniqueChars.forEach(i -> {
            int count = 0;
            for(int j =0; j<s.length(); j++){
                if(i == s.charAt(j)){
                    count++;
                }
            }
            charCount.put(i, count);
            count=0;

        });
        charCount.forEach((key, value) -> {
            for(int i=1; i<= value; i++){
                weight.add(charNumMap.get(key)*i);
            }
        });

        for(int i=0; i<queries.size(); i++){
            if(weight.contains(queries.get(i))){
                result.add("YES");
            }
            else {
                result.add("NO");
            }
        }

        return result;



    }

    public static void main(String[] args){
        String s = "abccddde";
        List<Integer> queries = new ArrayList<>();
        queries.add(1);
        queries.add(3);
        queries.add(12);
        queries.add(5);
        queries.add(9);
        queries.add(10);

        System.out.println(weightedUniformStrings(s, queries));


    }
}
