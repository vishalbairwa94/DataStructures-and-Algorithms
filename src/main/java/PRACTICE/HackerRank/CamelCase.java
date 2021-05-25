package PRACTICE.HackerRank;

public class CamelCase {

    public static int camelcase(String s) {
        // Write your code here
        int count = 1;
        char[] sChar = s.toCharArray();
        int n = sChar.length;
        for(int i = 0; i < n; i++){
            if(Character.isUpperCase(sChar[i])){
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args){
        System.out.println(camelcase("saveChangesInTheEditor"));
    }
}
