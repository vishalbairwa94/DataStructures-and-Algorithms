package PRACTICE.DynamicProgramming;


//time complexity is O(n2)
public class LIS {
    public static int longestIncSub(int[] arr){
        int n = arr.length;
        int i,j,max = 0;
        int[] lis = new int[n];

        for(i=0;i<n;i++){
            lis[i] = 1;
        }

        for(i = 1; i<n; i++){
            for(j = 0; j< i; j++){
                if(arr[i] > arr[j] && lis[i] < lis[j] + 1){
                    lis[i] = lis[j] + 1;
                }
            }
        }

        for(i=0; i<n;i++){
            if(lis[i] > max){
                max = lis[i];
            }
        }
        return max;
    }

    public static void main(String args[]){
        int arr[] = {10, 22, 9, 33, 21, 50, 41, 60};
        System.out.println(longestIncSub(arr));
    }
}
