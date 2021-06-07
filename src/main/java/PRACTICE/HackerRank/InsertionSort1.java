package PRACTICE.HackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsertionSort1 {
    public static void insertionSort1(int n, List<Integer> arr) {
        // Write your code here
        for(int i = 1; i<n; i++){
            int key = arr.get(i);
            int j = i-1;
            while(j>=0 && arr.get(j) > key){
                arr.set((j+1), arr.get(j));
                printArrayAsString(arr);
                j = j -1;

            }
            arr.set((j+1), key);

        }
        printArrayAsString(arr);

    }

    public static void printArrayAsString(List<Integer> arr){
        StringBuffer sb = new StringBuffer();
        for(int each : arr){
            sb.append(each);
            sb.append(" ");
        }
        String s = sb.toString();
        System.out.println(s);
    }

    public static void main(String[] args){
        List<Integer> unsorted = new ArrayList<>();
        unsorted.add(2);
        unsorted.add(4);
        unsorted.add(6);
        unsorted.add(8);
        unsorted.add(3);

        insertionSort1(5, unsorted);
    }
}
