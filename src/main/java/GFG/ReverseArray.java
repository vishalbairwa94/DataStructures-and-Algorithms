package GFG;

public class ReverseArray {
    public static void reverseArray(int arr[]){
        int n = arr.length;
        int start =0;
        int end = n-1;

        while (start<=end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        System.out.println("Array reversed : ");
        for(int i=0; i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {10,5,7,30};
        reverseArray(arr );

    }
}
