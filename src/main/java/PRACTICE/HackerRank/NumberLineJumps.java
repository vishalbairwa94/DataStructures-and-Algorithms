package PRACTICE.HackerRank;

public class NumberLineJumps {

    public static String kangaroo(int x1, int v1, int x2, int v2){

        String result = null;

        if(x2 > x1 && v2 > v1){
            result =  "NO";
        }

        if(x1 > x2 && v1 > v2){
            result =  "NO";
        }

        for(int i = 1; i < 100; i++){
            int kang1Path = x1 + (v1*i);
            int kang2Path = x2 + (v2 * i);

            if (kang1Path == kang2Path) {
                result = "YES";
                break;
            }

        }

        if(result == null){
            result = "NO";
        }
        return result;
    }

    public static void main(String[] args){
        System.out.println(kangaroo(21,6,47,3));
    }
}
