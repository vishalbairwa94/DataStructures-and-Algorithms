package GFG;

public class CheckSorted {
    public static boolean isSorted(int arr[]){
        int n = arr.length;
        boolean res = false;
        for(int i=0; i < n-1; i++){
            if(arr[i+1] >= arr[i]){
                res = true;
            }
            else{
                res = false;
                break;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = {8,100,10,12};
        System.out.println(isSorted(arr));
    }
}
