package PRACTICE.HackerRank;

import java.util.ArrayList;
import java.util.List;

public class FunnyString {

    public static String funnyString(String s) {
        // Write your code here
        String reverseString = findReverse(s);
        List<Integer> sAscii = findAscii(s);
        List<Integer> revAscii = findAscii(reverseString);

        List<Integer> sAbsDiff = findDiff(sAscii);
        List<Integer> revAbsDiff = findDiff(revAscii);

        if(sAbsDiff.equals(revAbsDiff)){
            return "Funny";
        }
        else{
            return "Not Funny";
        }

    }

    public static String findReverse(String s){
        String word = new String();
        for(int i = s.length()-1; i>=0; i--){
            word = word+s.charAt(i);
        }
        return word;
    }

    public static List<Integer> findAscii(String a){
        List<Integer> asciiList = new ArrayList<>();
        for(int i=0; i<a.length(); i++){
            int ascii = (int) a.charAt(i);
            asciiList.add(ascii);
        }

        return asciiList;
    }

    public static List<Integer> findDiff(List<Integer> s){
        List<Integer> absDiff = new ArrayList<>();
        for(int i=0; i<s.size()-1; i++){
            int diff = Math.abs(s.get(i) - s.get(i+1));
            absDiff.add(diff);
        }
        return absDiff;
    }

    public static void main(String[] args){
        String s = "abc";
        System.out.println(funnyString(s));
    }
}
