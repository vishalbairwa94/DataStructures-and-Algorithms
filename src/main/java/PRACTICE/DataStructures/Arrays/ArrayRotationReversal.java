package PRACTICE.DataStructures.Arrays;

public class ArrayRotationReversal {

    static void reverseArray(int arr[], int start, int end)
    {
        int temp;
        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void rotate(int arr[], int d, int n){
        if(d==0) {
            return;
        }

        d = d%n;
        reverseArray(arr, 0, d-1);
        reverseArray(arr, d, n-1);
        reverseArray(arr, 0, n-1);
    }



    public static void printArray(int arr[], int n){
        for(int i = 0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String args[]){
        ArrayRotationReversal arrayRotationReversal = new ArrayRotationReversal();
        int arr[] = {1,2,3,4};
        arrayRotationReversal.rotate(arr, 2, 4);
        arrayRotationReversal.printArray(arr, 4);
    }
}
