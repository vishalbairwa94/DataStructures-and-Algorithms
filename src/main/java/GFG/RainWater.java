package GFG;

public class RainWater {
    public static int rainWaterTrapping(int arr[]){
        int n = arr.length;
        int res = 0;
        int[] lmax = new int[n];
        int[] rmax = new int[n];
        lmax[0] = arr[0];
        for(int i = 1; i<n; i++){
            lmax[i] = Math.max(arr[i], lmax[i-1]);
        }
        rmax[n-1] = arr[n-1];
        for(int i=n-2;i>=0;i--){
            rmax[i] = Math.max(rmax[i+1], arr[i]);
        }
        for(int i=1; i<n-1; i++){
            res = res + (Math.min(lmax[i], rmax[i]) -arr[i]);
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = {3,0,1,2,5};
        System.out.println(rainWaterTrapping(arr));
    }
}
