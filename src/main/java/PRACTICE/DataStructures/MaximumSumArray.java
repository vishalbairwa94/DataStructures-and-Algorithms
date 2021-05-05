package PRACTICE.DataStructures;

import java.util.Arrays;

public class MaximumSumArray {

    public static void rotation(int arr[]){
        int n = arr.length;
        int temp;
        for(int i=0; i < n-1; i++){
            temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
    }

    public static int resultSum(int arr[]){
        int max=0;
        int n = arr.length;
        for(int i = 0; i < n; i++){
            rotation(arr);
//            System.out.println(Arrays.toString(arr));
            int sum = 0;
            for(int j=0; j < n; j++){
//                System.out.println(arr[j]*j);
                sum = sum + arr[j]*j;
//                System.out.println("Sum = " + sum);
                if(sum > max){
                    max = sum;
            }
            }
        }
        return max;
    }

    public static void main(String args[]){
        int arr[] = {8, 3, 1, 2};
        System.out.println(resultSum(arr));
    }
}
