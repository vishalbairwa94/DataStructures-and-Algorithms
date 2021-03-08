public class LCM {
    private static long euclid_gcd(long a, long b) {
        long divisor = a >= b ? a : b;
        long dividend = a <= b ? a : b;
        while (divisor != 0) {
            long remainder = dividend % divisor;
            dividend = divisor;
            divisor = remainder;
        }
        return dividend;
    }

    private static long lmc_fast(long a, long b) {
        return (a * b) / euclid_gcd(a, b);
    }

    public static void main(String[] args){
        System.out.println(lmc_fast(18, 35));
    }
}
