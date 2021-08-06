package GFG;

public class Deletion {
    public static void deletion(int arr[], int x){
        int n = arr.length;
        int i;
        for(i=0; i<n; i++){
            if(arr[i] == x){
                break;
            }
            if(i==n){
                System.out.println("Element not found");
            }
        }
        for(int j = i; j<n-1; j++){
            arr[j] = arr[j+1];
        }

        System.out.println("After deletion: ");
        for(int k =0; k<n; k++){
            System.out.print(arr[k] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {3,8,12,5,6};
        deletion(arr, 12);
    }
}
