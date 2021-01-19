import java.util.Scanner;

public class SumOfDigits {
    static int sumOfDigits(int first_digit, int second_digit){
        return first_digit + second_digit;
    }

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int a = 12;
        int b = 5;
        System.out.println(sumOfDigits(a,b));
    }
}
