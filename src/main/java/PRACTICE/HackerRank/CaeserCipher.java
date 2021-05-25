package PRACTICE.HackerRank;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CaeserCipher {

    public static String caesarCipher(String s, int k) {
        // Write your code here
        String alphas = "abcdefghijklmnopqrstuvwxyz";
        String alphas2 = "abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz";
        char[] alphaChars = alphas.toCharArray();
        char[] alphaChars2 = alphas2.toCharArray();

        char[] sChar = s.toCharArray();

        char[] result = new char[s.length()];


        for(int i =0; i<s.length(); i++){
            for(int j = 0; j<alphaChars.length; j++){
                if(sChar[i] == '-'){
                    result[i] = '-';
                }
                else{
                    if(Character.toLowerCase(sChar[i]) == alphaChars[j]){

                        if (Character.isUpperCase(sChar[i])){
                            result[i] = Character.toUpperCase(alphaChars2[j+(k)]);
                        }
                        else{
                            result[i] = alphaChars2[j+(k)];
                        }

                    }
                }


            }

        }
        return toString1(result);

    }

    public static String toString1(char[] a)
    {
        String string = new String(a);
        return string;
    }

    public static void main(String[] args){
        System.out.println(caesarCipher("middle-Outz", 2));
    }
}
