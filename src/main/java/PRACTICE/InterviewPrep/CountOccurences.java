package PRACTICE.InterviewPrep;

public class CountOccurences {
    //time complexity of O(n)
    public static int countOccLinear(int arr[], int data){
        int n = arr.length;
        int count = 0;

        for(int i =0; i<n; i++){
            if(arr[i] == data){
                count++;
            }
        }
        return count;
    }

    //time complexity of O(logn + count)
    public static int countOccUsingBinary(int arr[], int x){
        int n = arr.length;
        int ind = binarySearch(arr, 0, n-1, x);

        if(ind == -1){
            return 0;
        }

        int count = 1;
        int left = ind -1;

        while (left >=0 && arr[left] == x){
            count++;
            left--;
        }

        int right = ind + 1;
        while (right < n && arr[right] == x){
            count++;
            right++;
        }

        return count;
    }

    public static int binarySearch(int arr[], int l, int r, int x){
        if(r < l){
            return -1;
        }

        int mid = l + (r-l)/2;

        if(arr[mid] == x){
            return mid;
        }

        if(arr[mid] > x){
            return binarySearch(arr, l, mid-1, x);
        }

        return binarySearch(arr, mid+1, r,x);


    }

    //using improved binary
    //time complexity O(logn)
    static int first(int arr[], int low, int high, int x, int n)
    {
        if(high >= low)
        {
            /*low + (high - low)/2;*/
            int mid = (low + high)/2;
            if( ( mid == 0 || x > arr[mid-1]) && arr[mid] == x)
                return mid;
            else if(x > arr[mid])
                return first(arr, (mid + 1), high, x, n);
            else
                return first(arr, low, (mid -1), x, n);
        }
        return -1;
    }

    static int last(int arr[], int low, int high, int x, int n)
    {
        if(high >= low)
        {
            /*low + (high - low)/2;*/
            int mid = (low + high)/2;
            if( ( mid == n-1 || x < arr[mid+1]) && arr[mid] == x )
                return mid;
            else if(x < arr[mid])
                return last(arr, low, (mid -1), x, n);
            else
                return last(arr, (mid + 1), high, x, n);
        }
        return -1;
    }

    public static int count(int arr[], int x, int n){
        int i;
        int j;

        i = first(arr, 0, n-1, x, n);
        if(i == -1){
            return i;
        }
        j = last(arr, i, n-1,x, n);
        return j - i +1;
    }

    public static void main(String[] args){
        int arr[] = {1, 2, 2, 3, 3, 3, 3};
        int data = 2;
        int n = arr.length;
        System.out.println(countOccLinear(arr, data));
        System.out.println(countOccUsingBinary(arr, data));
        System.out.println(count(arr, data, n));
    }
}
