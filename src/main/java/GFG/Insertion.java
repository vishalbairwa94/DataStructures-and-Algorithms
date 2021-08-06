package GFG;

public class Insertion {
    public static void insert(int arr[], int data, int pos){
        int index = pos-1;
        int n = arr.length;
        for(int i=n-2; i>=index; i--){
            arr[i+1] = arr[i];
        }
        arr[index] = data;

        System.out.println("After insertion:");
        for(int i = 0; i<n;i++){
            System.out.print(arr[i]);
        }
    }

    public static void main(String[] args) {
        int arr[] = {5,10,20};
        insert(arr, 7, 2);
    }
}
