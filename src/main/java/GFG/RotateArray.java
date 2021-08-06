package GFG;

public class RotateArray {
    public static void rotateArrayByOne(int arr[]){
        int temp = arr[0];
        for(int i=0;i<arr.length-1;i++){
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = temp;

        System.out.println("Array after rotation: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void rotateArrayByD(int arr[], int d){
        reverse(arr,0, d-1);
        reverse(arr, d, arr.length-1);
        reverse(arr, 0, arr.length-1);

        System.out.println("Array after " + d + " rotation : ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }

    }

    public static void reverse(int arr[], int start, int end){
        while (start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        rotateArrayByOne(arr);
        System.out.println();
        rotateArrayByD(arr, 2);
    }
}
