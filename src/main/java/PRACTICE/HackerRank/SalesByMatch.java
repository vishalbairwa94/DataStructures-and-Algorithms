package PRACTICE.HackerRank;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SalesByMatch {
    public static int sockMerchant(int n, List<Integer> ar){
        Set<Integer> colorsUnique = new HashSet<>();
        int count = 0;
        for(int i =0; i<n; i++){
            if(!colorsUnique.contains(ar.get(i))){
                colorsUnique.add(ar.get(i));
            }
            else{
                count++;
                colorsUnique.remove(ar.get(i));
            }
        }
        return count;
    }

        public static void main(String[] args){
        List<Integer> ar = new ArrayList<>();
        ar.add(10);
        ar.add(20);
        ar.add(20);
        ar.add(10);
        ar.add(10);
        ar.add(30);
        ar.add(50);
        ar.add(10);
        ar.add(20);

        System.out.println(sockMerchant(9, ar));
        }

    }

