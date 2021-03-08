public class GreatestCommonDivisor {
    private static int euclid_gcd(int a, int b) {
        int divisor = a >= b ? a : b;
        int dividend = a <= b ? a : b;
        while (divisor != 0) {
            int remainder = dividend % divisor;
            dividend = divisor;
            divisor = remainder;
        }
        return dividend;
    }

    public static void main(String[] args){
        System.out.println(euclid_gcd(18, 35));
    }
}
