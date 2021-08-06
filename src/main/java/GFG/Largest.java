package GFG;

public class Largest {
    public static int findLargest(int arr[]){
        int n = arr.length;
        int max = 0;
        int index = -1;
        for(int i=0;i<n;i++){
            if(arr[i] > max){
                max = arr[i];
                index = i;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int arr[] = {10,5,20,8};
        System.out.println(findLargest(arr));
    }
}
