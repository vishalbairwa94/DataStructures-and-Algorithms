package PRACTICE.HackerRank;

import java.util.ArrayList;
import java.util.List;

public class BeautifulBinaryString {
    public static int beautifulBinaryString(String b) {
        // Write your code here

        int count = 0;
        for(int i = 0; i<b.length(); i++){
            if(b.charAt(i) == '0' && b.charAt(i+1) == '1' && b.charAt(i+2) == '0'){
                count++;
                i = i+2;
            }
            if((b.length() - (i+1)) < 3){
                break;
            }

        }

        return count;

    }

    public static void main(String[] args){
        System.out.println(beautifulBinaryString("0100101010100010110100100110110100011100111110101001011001110111110000101011011111011001111100011101"));
    }
}
