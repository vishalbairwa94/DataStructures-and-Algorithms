package GFG;

public class Frequency {
    public static void frequencyArray(int arr[]){
        int count = 1;
        int n = arr.length;
        for(int i=0;i<n-1; i++){
            if(arr[i] == arr[i+1]){
                count++;
            }
            if(arr[i] != arr[i+1] || i == n-2){
                System.out.println("Frequency of " + arr[i] + " is " + count);
                count = 1;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {10,10,10,25,30,30,30};
        frequencyArray(arr);
    }
}
