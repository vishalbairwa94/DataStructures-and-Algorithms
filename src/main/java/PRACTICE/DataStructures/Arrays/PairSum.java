package PRACTICE.DataStructures.Arrays;

import java.util.Arrays;

public class PairSum {

    private static int[] findPair(int arr[], int d){
        int n = arr.length;
        int result[] = new int[2];

        for(int i = 0; i < n; i++){
            for(int j = 1; j < n; j++){
                if(arr[i] + arr[j] == d){
                    result[0] = arr[j];
                    result[1] = arr[i];
                }
            }
        }
        return result;
    }

    public static void main(String args[]){
        int arr[] = {11, 15, 6, 8, 9, 10};
        int d = 16;
        System.out.println(Arrays.toString(findPair(arr, d)));
    }
}
