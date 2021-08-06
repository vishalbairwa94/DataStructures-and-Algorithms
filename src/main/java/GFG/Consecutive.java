package GFG;

public class Consecutive {
    public static int countConsecutiveOne(int arr[]){
        int n = arr.length;
        int count = 0;
        int res = 0;
        for(int i=0; i<n; i++){
            if(arr[i] == 0){
                count = 0;
            }
            else{
                count++;
                res = Math.max(res, count);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = {0,1,1,0,1,0};
        System.out.println(countConsecutiveOne(arr));
    }
}
