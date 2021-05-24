package PRACTICE.HackerRank;

public class CountingValleys {

    public static int countingValleys(int steps, String path) {
        // Write your code here
        int count = 0;
        int prev_sum = 0;
        int sum = 0;
        char[] pathArray = path.toCharArray();
        int n = steps;

        for(int i =0; i<n;i++){
            int pathNumber = 0;
            if(pathArray[i] == 'U'){
                pathNumber = 1;
            }
            else{
                pathNumber = -1;
            }

            prev_sum = sum;
            sum = sum+pathNumber;

            if(sum==-1 && prev_sum==0){
                count++;
            }


        }

        return count;

    }

    public static void main(String[] args){
        System.out.println(countingValleys(8, "DDUUUUDD"));
    }
}
