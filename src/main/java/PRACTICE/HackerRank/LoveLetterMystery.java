package PRACTICE.HackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LoveLetterMystery {

    public static int theLoveLetterMystery(String s) {
        // Write your code here
        int n = s.length();
        int c = 0;

        for (int ii = 0; ii < n; ii++) {
            int count = 0;
            // use two pointers;
            int i = 0, j = s.length() - 1;
            while (i < j) {
                count += Math.abs(s.charAt(i) - s.charAt(j));
                i++;
                j--;
            }
            c = count;
        }
        return c;



    }
    public static void main(String[] args){
        System.out.println(theLoveLetterMystery("cbax"));
    }
}
