package PRACTICE.HackerRank;

import java.util.ArrayList;
import java.util.List;

public class Anagram {

    public static int anagram(String s) {
        // Write your code here
        int n = s.length();
        if(n%2 !=0){
            return -1;
        }
        int mid = n/2;

        String first_half = s.substring(0, mid);
        String second_half = s.substring(mid);

        List<Character> first_list = new ArrayList<>();

        for(int i=0; i<first_half.length();i++){
            first_list.add(first_half.charAt(i));
        }

        int count = 0;

        for(int i =0; i<first_list.size();i++){
            if(!second_half.contains(first_list.get(i).toString())){
                count++;
            }
        }

        return count;


    }

    public static void main(String[] args){
        System.out.println(anagram("fdhlvosfpafhalll"));
    }
}
