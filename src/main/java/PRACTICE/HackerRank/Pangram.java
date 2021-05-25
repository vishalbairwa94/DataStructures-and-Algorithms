package PRACTICE.HackerRank;

public class Pangram {

    public static String pangrams(String s) {
        // Write your code here
        String alpha = "abcdefghijklmnopqrstuvwxyz";
        for(int i = 0; i< alpha.length(); i++){
            boolean found = false;
            for(int j = 0; j<s.length(); j++){
                if(alpha.charAt(i) == Character.toLowerCase(s.charAt(j))){
                    found = true;
                }
            }
            if(!found){
                return "not pangram";
            }
        }
        return "pangram";

    }

    public static void main(String[] args){
        System.out.println(pangrams("We promptly judged antique ivory buckles for the prize"));
    }
}
