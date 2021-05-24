package PRACTICE.HackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DesignerPdfViewer {
    public static int designerPdfViewer(List<Integer> h, String word) {
        // Write your code here
        String alphabets = "abcdefghijklmnopqrstuvwxyz";
        char[] alphaChar = alphabets.toCharArray();
        char[] wordChar  = word.toCharArray();
        int max_height = 0;

        for(int i=0; i<wordChar.length; i++){
            for(int j=0; j<alphaChar.length; j++){
                if(wordChar[i] == alphaChar[j]){
                    int height  = h.get(j);
                    if(height > max_height){
                        max_height = height;
                    }
                }
            }
        }
        int len = word.length();

        return max_height * len;

    }

    public static void main(String[] args){
        int[] h = {1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 7};
        List<Integer> ar = new ArrayList<>();
        for(int i = 0; i<h.length; i++){
            ar.add(h[i]);
        }
        System.out.println(designerPdfViewer(ar, "zaba"));
    }


}
