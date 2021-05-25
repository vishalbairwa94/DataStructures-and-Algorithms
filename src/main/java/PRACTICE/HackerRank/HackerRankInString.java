package PRACTICE.HackerRank;

public class HackerRankInString {
    public static String hackerrankInString(String s) {
        // Write your code here
        String str = "hackerrank";
        if (s.length() < str.length()) {
            return "NO";
        }
        int j = 0;
        for (int i = 0; i < s.length(); i++) {
            if (j < str.length() && s.charAt(i) == str.charAt(j)) {
                j++;
            }
        }
        return (j == str.length() ? "YES" : "NO");

    }

    public static void main(String[] args){
        System.out.println(hackerrankInString("hereiamstackerrank"));
    }
}
