package GFG;

public class Stock {
    public static int stockBuySell(int arr[]){
        int profit = 0;
        int n = arr.length;
        for(int i = 1; i<n;i++){
            if(arr[i] > arr[i-1]){
                profit = profit + (arr[i] - arr[i-1]);
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        int arr[] = {1,5,3,8,12};
        System.out.println(stockBuySell(arr));
    }
}
