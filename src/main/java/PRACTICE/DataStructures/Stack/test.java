package PRACTICE.DataStructures.Stack;

import java.util.HashSet;
import java.util.Set;

public class test {
    public static String duplicate(String str) {
//        String res = "";
//        String result = "";
//        int n = str.length();
//        for(int i = 0; i<n-1; i++){
//            for(int j = i+1; j<n; j++){
//                if(str.toLowerCase().charAt(i) == str.toLowerCase().charAt(j)){
//                    res = res + str.charAt(i);
//                }
//            }
//        }
//
//        Set<Character> unique = new HashSet<>();
//        for(int i =0; i<res.length();i++){
//            unique.add(res.charAt(i));
//        }
//        for(Character each : unique){
//            result = result + each;
//        }
//        return result;
//        String result = "";
//        int cnt = 0;
//        char[] inp = str.toCharArray();
//        System.out.println("Duplicate Characters are:");
//        for (int i = 0; i < str.length(); i++) {
//            for (int j = i + 1; j < str.length(); j++) {
//                if (inp[i] == inp[j]) {
//                    result = result + inp[j];
//                    cnt++;
//                    break;
//                }
//            }
//        }
//        return result;
        str = str.toLowerCase();
        int count;
        String res = "";

        //Converts given string into character array
        char string[] = str.toCharArray();

//        System.out.println("Duplicate characters in a given string: ");
        //Counts each character present in the string
        for (int i = 0; i < string.length; i++) {
            count = 1;
            for (int j = i + 1; j < string.length; j++) {
                if (string[i] == string[j] && string[i] != ' ') {
                    count++;
                    //Set string[j] to 0 to avoid printing visited character
                    string[j] = '0';
                }
            }
            //A character is considered as duplicate if count is greater than 1
            if (count > 1 && string[i] != '0')
                res = res + string[i];

        }
        return res;
    }

    public static void main(String args[]){
        String str = "Test";
        System.out.println(duplicate(str));
    }
}
