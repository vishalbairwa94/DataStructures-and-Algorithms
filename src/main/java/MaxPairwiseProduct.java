import java.util.*;
import java.io.*;

public class MaxPairwiseProduct {
    static long getMaxPairProduct(int[] number){
        int size = number.length;

        int max_indx_1 = -1;
        int max_index_2 = -1;

        for(int i = 0; i < size; i++){
            if((max_indx_1==-1) || number[i] > number[max_indx_1]){
                max_indx_1 = i;
            }
        }

        for(int i = 0;i<size;i++){
            if((i!=max_indx_1) && ((max_index_2==-1) || number[i]>number[max_index_2])){
                max_index_2 = i;
            }
        }
        return (long)number[max_indx_1] * number[max_index_2];
    }

    public static void main(String[] args) {
        FastScanner scanner = new FastScanner(System.in);
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.println(getMaxPairProduct(numbers));
    }

    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        FastScanner(InputStream stream) {
            try {
                br = new BufferedReader(new
                        InputStreamReader(stream));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
    }

}
