package PRACTICE.HackerRank;

import java.util.ArrayList;
import java.util.List;

public class GradingStudent {

    public static List<Integer> gradingStudent(List<Integer> grades){
        List<Integer> outputGrades = new ArrayList<>();
        for(Integer each : grades){
            int div = each / 5;
            int roundedGrade = 5 * (div+1);
            if((roundedGrade - each)>=3){
                roundedGrade = each;
            }
            if(roundedGrade < 40){
                roundedGrade = each;
            }

            outputGrades.add(roundedGrade);
        }

        return outputGrades;
    }

    public static void main(String args[]){
        List<Integer> grades = new ArrayList<>();
        grades.add(75);
        grades.add(67);
        grades.add(40);
        grades.add(33);

        System.out.println(gradingStudent(grades).toString());
    }
}
