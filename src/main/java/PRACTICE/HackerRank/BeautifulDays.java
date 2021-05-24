package PRACTICE.HackerRank;

public class BeautifulDays {

    public static int beautifulDays(int i, int j, int k) {
        // Write your code here
        int count = 0;

        for(int z = i; z<=j; z++){
            int rever = reverse(z);
            int diff = Math.abs(z-rever);
            if(diff % k == 0){
                count++;
            }

        }
        return count;

    }

    public static int reverse(int a){
        int num = a, reversed = 0;

        while(num != 0) {

            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        return reversed;
    }

    public static void main(String[] args){
        System.out.println(beautifulDays(20, 23, 6));
    }
}
