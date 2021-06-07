package PRACTICE.HackerRank;

import java.util.ArrayList;
import java.util.List;

public class StringConstruction {

    public static int stringConstruction(String s) {
        // Write your code here
        List<Character> p = new ArrayList<>();
        for(int i = 0; i<s.length(); i++){
            if(!p.contains(s.charAt(i))){
                p.add(s.charAt(i));
            }
        }
        return p.size();

    }

    public static void main(String[] args){
        System.out.println(stringConstruction("abab"));
    }
}
