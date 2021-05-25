package PRACTICE.HackerRank;

public class SeperateNumber {

    public static void separateNumbers(String s) {
        // Write your code here
        boolean valid = false;
        int firstNum = 0;
        for(int i = 1; i<=s.length()/2; i++){
            int num = Integer.parseInt(s.substring(0,i));
            firstNum = num;

            String numInString = Integer.toString(num);
            while (numInString.length() < s.length()){
                numInString = numInString + Integer.toString(++num);
            }
            if(numInString.equals(s)){
                valid = true;
                break;
            }
        }
        System.out.println(valid ? "YES " + firstNum : "NO");

    }

    public static void main(String[] args){
        separateNumbers("10001001100210031004100510061007");
    }
}
