package PRACTICE.DynamicProgramming;

public class LCS {
    public static int longestComSub(char[] x, char[] y){
        int n = x.length;
        int m = y.length;

        int lcb[][] = new int[n+1][m+1];

        for(int i=0; i<=n; i++){
            for(int j = 0; j<=m; j++){
                if(i == 0 || j == 0){
                    lcb[i][j] = 0;
                }
                else if(x[i-1] == y[j-1]){
                    lcb[i][j] = lcb[i-1][j-1] +1;
                }
                else{
                    lcb[i][j] = Math.max(lcb[i-1][j], lcb[i][j-1]);
                }
            }
        }
        return lcb[n][m];

    }

    public static void main(String args[]){
        char[] x = {'G', 'X', 'T', 'X', 'A', 'Y', 'B'};
        char[] y = {'A', 'G', 'G', 'T', 'A', 'B'};

        System.out.println(longestComSub(x,y));
    }
}
