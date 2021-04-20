import java.util.*;

public class FractionalKnapsack {
    private static double getOptimalValue(int capacity, int[] values, int[] weights) {
        double value = 0;
        //write your code here
        Map<Integer, Integer> valueWeightMap = new HashMap<>();
        List<Integer> ratio_list = new ArrayList<>();

        for(int i=0; i <= weights.length ; i++){
            int ratio = values[i] / weights[i];
            ratio_list.add(ratio);
        }

        Collections.sort(ratio_list, Collections.reverseOrder());

        for(int i=0; i <= weights.length ; i++){
            if(values[i] / weights[i] == ratio_list.get(i)){
                valueWeightMap.put(values[i], weights[i]);
            }

        }

        return value;
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int capacity = scanner.nextInt();
        int[] values = new int[n];
        int[] weights = new int[n];
        for (int i = 0; i < n; i++) {
            values[i] = scanner.nextInt();
            weights[i] = scanner.nextInt();
        }
        System.out.println(getOptimalValue(capacity, values, weights));
    }
} 