package GFG;

public class SecondLargest {
    public static int findSecondLargest(int arr[]){
        int n = arr.length;
        int largest = Largest.findLargest(arr);
        int res = -1;
        for(int i=0;i<n;i++){
            if(arr[i] != arr[largest]){
                if(res == -1){
                    res = i;
                }
                else if(arr[i] > arr[res]){
                    res = i;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = {10,15,20,8};
        System.out.println(findSecondLargest(arr));
    }
}
