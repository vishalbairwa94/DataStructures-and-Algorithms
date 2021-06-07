package PRACTICE.HackerRank;

public class PalindromeIndex {
    public static int palindromeIndex(String s) {
        // Write your code here
        int n = s.length();
        int i,j,a,b;

        for(i=0, j=n-1; i < n; i++, j--){
            if(s.charAt(i) != s.charAt(j)){
                break;
            }
        }

        if (i > j){
            return -1;
        }

        for(a=i+1, b=j; a<j && b > i+1; a++, b--){
            if(s.charAt(a)!=s.charAt(b)){
                return j;
            }
        }
        return i;

    }

    public static void main(String[] args){
        System.out.println(palindromeIndex("aaab"));
    }
}
