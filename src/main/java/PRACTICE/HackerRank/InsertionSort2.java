package PRACTICE.HackerRank;

import java.util.ArrayList;
import java.util.List;

public class InsertionSort2 {

    public static void insertionSort2(int n, List<Integer> arr) {

        for(int i =0; i<n-1; i++){
            for(int j = 0; j< n-i-1; j++){
                if(arr.get(j) > arr.get(j+1)){
                    int temp = arr.get(j+1);
                    arr.set((j+1), arr.get(j));
                    arr.set(j, temp);
                    printArrayAsString(arr);
                }
            }
        }

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
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(4);
        arr.add(3);
        arr.add(5);
        arr.add(6);
        arr.add(2);

        insertionSort2(6, arr);
    }
}
