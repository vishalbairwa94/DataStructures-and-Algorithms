package PRACTICE.DataStructures;

public class ArrayRotation {
    public static void rotation(int arr[], int d, int n){
        for(int i = 0; i < d ; i++){
            leftRotate(arr, n);
        }

    }

    public static void leftRotate(int arr[], int n){
        int i, temp;
        temp = arr[0];

        for(i=0; i<n-1; i++){
            arr[i] = arr[i+1];
        }
        arr[n-1] = temp;
    }

    public static void printArray(int arr[], int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String args[]){
        ArrayRotation arrayRotation = new ArrayRotation();
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        arrayRotation.rotation(arr,2, 7);
        arrayRotation.printArray(arr, 7);

    }
}
