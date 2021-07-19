package PRACTICE.InterviewPrep;


//time complexity O(V+n)
public class OrderAlienLang {
    public static void printOrder(String[] words, int n){
        GraphTopo g = new GraphTopo(n);

        for(int i=0; i<words.length-1; i++){
            String word1 = words[i];
            String word2 = words[i+1];

            for(int j = 0; j<Math.min(word1.length(), word2.length()); j++){
                if(word1.charAt(j) != word2.charAt(j)){
                    g.addEdge(word1.charAt(j) - 'a', word2.charAt(j) - 'a');
                    break;
                }
            }
        }
        g.toposort();

    }

    public static void main(String[] args){
        String[] words = {"caa", "aaa", "aab"};
        printOrder(words, 3);
    }
}
