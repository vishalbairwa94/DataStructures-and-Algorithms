package PRACTICE.HackerRank;

import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StrongPassword {

    public static int minimumNumber(int n, String password) {
        // Return the minimum number of characters to make the password strong
        int count = 0;
        Pattern patternDigit = Pattern.compile("(\\d)");
        Pattern patternUpperCase = Pattern.compile("([A-Z])");
        Pattern patternLowerCase = Pattern.compile("([a-z])");
        Pattern patternSpecialCharacters = Pattern.compile("(\\W)");

        Matcher matcherDigit = patternDigit.matcher(password);
        Matcher matcherUpperCase = patternUpperCase.matcher(password);
        Matcher matcherLowerCase = patternLowerCase.matcher(password);
        Matcher matcherSpecialChar = patternSpecialCharacters.matcher(password);

        if(!matcherDigit.find()){
            count++;
        }
        if(!matcherUpperCase.find()){
            count++;
        }
        if(!matcherLowerCase.find()){
            count++;
        }
        if(!matcherSpecialChar.find()){
            count++;
        }
        if(count+password.length() < 6){
            count = count + 6 - (count+password.length());
        }

        return count;
    }

    public static void main(String[] args){
        System.out.println(minimumNumber(11, "#HackerRank"));
    }
}
