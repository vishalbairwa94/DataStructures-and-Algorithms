package PRACTICE.HackerRank;

import java.util.ArrayList;
import java.util.List;

public class MissingNumbers {
    public static List<Integer> missingNumbers(List<Integer> arr, List<Integer> brr) {
        // Write your code here
        List<Integer> result = new ArrayList<>();
        List<Integer> small = new ArrayList<>();
        List<Integer> big = new ArrayList<>();

        if(arr.size() < brr.size()){
            big = brr;
            small = arr;
        }
        else {
            big = arr;
            small = brr;
        }

        for(int i =0; i<big.size(); i++){
            if(!small.contains(big.get(i))){
                result.add(big.get(i));
            }
            else{
                if(countFreq(big, big.get(i))  > countFreq(small, big.get(i)) && !(result.contains(big.get(i)))){
                    result.add(big.get(i));
                }
            }

        }
        sort(result);

        return result;

    }

    public static int countFreq(List<Integer> arr, int a){
        int count = 0;
        int n = arr.size();
        for(int i = 0; i<n; i++){
            if(arr.get(i) == a){
                count++;
            }
        }
        return count;
    }

    public static void sort(List<Integer> arr) {
        // Write your code here
        int n =arr.size();
        for(int i = 1; i<n; i++){
            int key = arr.get(i);
            int j = i-1;
            while(j>=0 && arr.get(j) > key){
                arr.set((j+1), arr.get(j));
                j = j -1;

            }
            arr.set((j+1), key);

        }
    }

    public static void main(String[] args){
        List<Integer> arr = new ArrayList<>();
        List<Integer> brr = new ArrayList<>();
        int[] arr1 = {203, 204, 205, 206, 207, 208, 203, 204, 205, 206};
        int[] arr2 = {203, 204, 204, 205, 206, 207, 205, 208, 203, 206, 205, 206, 204};
        for(int i = 0; i<arr1.length; i++){
            arr.add(arr1[i]);
        }
        for(int i =0; i<arr2.length;i++){
            brr.add(arr2[i]);
        }
        System.out.println(missingNumbers(arr, brr));

    }
}
