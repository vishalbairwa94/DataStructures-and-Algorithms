package PRACTICE.Strings;

public class SwapFirstLast {

    public static String swapFirstLast(String str){
        char[] ch = str.toCharArray();
        for(int i =0; i< ch.length; i++){
            int k = i;
            while(i < ch.length && ch[i] != ' '){
                i++;
            }
            char temp = ch[k];
            ch[k] = ch[i-1];
            ch[i-1] = temp;
        }

        return new String(ch);
    }

    public static void main(String[] args){
        String test = "geeks for geeks";
        //expected result - "seekg rof seekg"
        System.out.println(swapFirstLast(test));


    }
}
