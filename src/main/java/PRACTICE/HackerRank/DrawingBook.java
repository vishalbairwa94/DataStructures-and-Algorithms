package PRACTICE.HackerRank;

public class DrawingBook {
    public static int pageCount(int n, int p) {
        // Write your code here
        int totalPageTurnCountFromFront = n / 2;
        int targetPageTurnCountFromFront = p / 2;
        int targetPageTurnCountFromBack = totalPageTurnCountFromFront - targetPageTurnCountFromFront;

        return Math.min(targetPageTurnCountFromFront, targetPageTurnCountFromBack);


    }




    public static void main(String[] args){
        System.out.println(pageCount(6,4));
    }
}
