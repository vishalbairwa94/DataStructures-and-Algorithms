package GFG;

public class Search {
    public static int searchIndex(int arr[], int x){
        int n = arr.length;
        for(int i = 0; i<n; i++){
            if(x==arr[i]){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        int arr[] = {20,4,5,6,7};
        int x = 5;
        System.out.println(searchIndex(arr, x));
    }
}
