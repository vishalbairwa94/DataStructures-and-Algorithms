package PRACTICE.HackerRank;

import java.util.ArrayList;
import java.util.List;

public class BreakingTheRecords {

    public static List<Integer> breakingRecords(List<Integer> scores) {

        int min_score = 0;
        int max_score = 0;
        int min_count = 0;
        int max_count = 0;

        List<Integer> count = new ArrayList<>();

        for(int i =0; i<scores.size(); i++){

            if(i == 0){
                min_score = scores.get(i);
                max_score = scores.get(i);
            }

            else{
                if(scores.get(i)>max_score){
                    max_score = scores.get(i);
                    max_count++;

                }

                if(scores.get(i)<min_score){
                    min_score = scores.get(i);
                    min_count++;

                }
            }



        }

        count.add(max_count);
        count.add(min_count);

        return count;

    }

    public static void main(String[] args){
        List<Integer> scores = new ArrayList<>();
        int[] score = {17, 45, 41, 60, 17, 41, 76, 43, 51, 40, 89, 92, 34, 6, 64, 7, 37, 81, 32, 50};
        for(int i =0; i<score.length; i++){
            scores.add(score[i]);
        }
        System.out.println(breakingRecords(scores));
    }
}
