package PRACTICE.DataStructures.Arrays;

public class RotationCount {

    public static int countRotation(int arr[]){
        int pos = 0;
        int min = arr[0];
        int n = arr.length;
        for(int i=1; i<n; i++){
            if(arr[i] < min){
                min = arr[i];
                pos = i;
            }
        }

        return pos;
    }
    public static void main(String args[]){
        int arr[] = {7, 9, 11, 12, 15};
        System.out.println(countRotation(arr));
    }

}
