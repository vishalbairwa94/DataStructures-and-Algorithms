package PRACTICE.DataStructures;

import java.util.Arrays;

public class FindArrayRotation {

    public static void findRotation(int arr[], int k){
        for(int i = 0; i<k; i++){
            rotation(arr);
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void rotation(int arr[]){
        int n = arr.length;
        int temp;
        for(int i=0; i < n-1; i++){
            temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
    }

    public static void main(String args[]){
        int arr[] = {1, 3, 5, 7, 9};
        findRotation(arr, 2);
    }
}
