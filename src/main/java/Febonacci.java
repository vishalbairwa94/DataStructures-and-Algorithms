public class Febonacci {
    private static long calc_fib(int n) {
        if (n <= 1)
            return n;

        int[] result = new int[n + 1];
        result[0] = 0;
        result[1] = 1;
        for (int i = 2; i < n + 1; i++) {
            result[i] = result[i - 1] + result[i - 2];
        }
        return result[n];
    }

    public static void main(String[] args){

        System.out.println(calc_fib(0));
    }
}
