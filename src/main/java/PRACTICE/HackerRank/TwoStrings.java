package PRACTICE.HackerRank;

import java.util.ArrayList;
import java.util.List;

public class TwoStrings {

    public static String twoStrings(String s1, String s2) {
        // Write your code here
        List<Character> charS1 = new ArrayList<>();

        for(int i=0;i<s1.length(); i++){
            charS1.add(s1.charAt(i));
        }

        for(int i=0; i<charS1.size(); i++){
            if(s2.contains(charS1.get(i).toString())){
                return "YES";
            }
        }
        return "NO";

    }

    public static void main(String[] args){
        System.out.println(twoStrings("hi", "world"));
    }
}
