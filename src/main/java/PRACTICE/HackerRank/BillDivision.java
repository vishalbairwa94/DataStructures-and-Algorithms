package PRACTICE.HackerRank;

import java.util.ArrayList;
import java.util.List;

public class BillDivision {

    public static void bonAppetit(List<Integer> bill, int k, int b) {
        // Write your code here
        int billDivided = 0;
        for(int i = 0; i < bill.size(); i++){
            if(i != k){
                billDivided = billDivided + bill.get(i);
            }
        }

        int annaShare = billDivided / 2;
        int actual = b - annaShare;

        if(actual == 0){
            System.out.println("Bon Appetit");
        }
        else{
            System.out.println(actual);
        }


    }

    public static void main(String[] args){
        List<Integer> arr = new ArrayList<>();
        arr.add(3);
        arr.add(10);
        arr.add(2);
        arr.add(9);

        bonAppetit(arr, 1, 7);
    }
}
