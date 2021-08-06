package GFG;

public class MoveZero {
    public static void moveAllZero(int arr[]){
        int n = arr.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[count];
                arr[count] = temp;
                count++;
            }
        }
        System.out.println("Array after processing: ");
        for(int i=0; i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {8,5,10,0,0,20};
        moveAllZero(arr);
    }
}
