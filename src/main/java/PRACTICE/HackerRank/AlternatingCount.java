package PRACTICE.HackerRank;

import java.util.ArrayList;
import java.util.List;

public class AlternatingCount {

    public static int alternatingCharacters(String s) {
        // Write your code here
        int count = 0;
        List<Character> charList = new ArrayList<>();
        for(int i = 0; i<s.length()-1; i++){
            if(s.charAt(i) == s.charAt(i+1)){
                count++;
            }
            else{
                charList.add(s.charAt(i));
            }
        }
        return count;

    }

    public static void main(String[] args){
        System.out.println(alternatingCharacters("AAABBB"));
    }
}
