package PRACTICE.HackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BigSorting {
    public static List<String> bigSorting(List<String> unsorted) {
        // Write your code here
        String[] arr = new String[unsorted.size()];
        List<String> sortedArray = new ArrayList<>();

        for(int i =0; i< unsorted.size(); i++){
            arr[i] = unsorted.get(i);
        }
        sortLargeNumbers(arr);
        sortedArray = printArray(arr);

        return sortedArray;
    }

    public static void sortLargeNumbers(String arr[]){
        Arrays.sort(arr, (left, right) ->
        {
            /* If length of left != right, then return
               the diff of the length else  use compareTo
               function to compare values.*/
            if (left.length() != right.length())
                return left.length() - right.length();
            return left.compareTo(right);
        });

    }

    public static List<String> printArray(String arr[]){
        List<String> sortedList = new ArrayList<>();
        int n = arr.length;
        for(int i=0; i<n; i++){
            sortedList.add(String.valueOf(arr[i]));
        }
        return sortedList;
    }

    public static void main(String[] args){
        List<String> unsorted = new ArrayList<>();
        unsorted.add("1");
        unsorted.add("200");
        unsorted.add("150");
        unsorted.add("3");

        System.out.println(bigSorting(unsorted));


    }
}
