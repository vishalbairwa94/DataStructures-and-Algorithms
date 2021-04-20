import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Change {
    private static int getChange(int m) {
        //write your code here
        int count = 0;
        List<Integer> listDeno = new ArrayList<>();
        listDeno.add(10);
        listDeno.add(5);
        listDeno.add(1);

        for(Integer i : listDeno){
            int remaninder = m % i;
            int req_coins = (m - remaninder) / i;
            count = count + req_coins;
            m = remaninder;
        }
        m = count;
        return m;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        System.out.println(getChange(m));

    }
}