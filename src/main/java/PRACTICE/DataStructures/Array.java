package PRACTICE.DataStructures;

public class Array {

    public static void rotateArray(int[] arr, int d){
        int n = arr.length;
        reverseArray(arr, 0, d-1);
        reverseArray(arr, d, n-1);
        reverseArray(arr, 0, n-1);

        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }

    }
    public static void reverseArray(int[] arr, int start, int end){
        int i = start;
        int j = end;
        for(i=start; i<j;i++){
            swap(arr, i, j);
            j--;
        }

    }

    public static void swap(int[] arr, int first, int second){
        int temp;

        temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    public static void main(String args[]) {
        int[] arr = {1,2,3,4,5,6,7};

        System.out.println("Original array");
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        rotateArray(arr, 2);
    }
}
