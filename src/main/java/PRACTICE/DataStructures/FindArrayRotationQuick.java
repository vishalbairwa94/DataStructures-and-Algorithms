package PRACTICE.DataStructures;

public class FindArrayRotationQuick {

    public static void rotate(int arr[], int k){
        int n = arr.length;
        for(int i = k; i < k+n; i++){
            System.out.print(arr[i%n] + " ");
        }
    }

    public static void main(String args[]){
        int arr[] = {1, 3, 5, 7, 9};
        rotate(arr, 2);
    }
}
