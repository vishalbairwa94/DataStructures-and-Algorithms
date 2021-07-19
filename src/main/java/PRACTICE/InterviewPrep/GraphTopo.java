package PRACTICE.InterviewPrep;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

public class GraphTopo {
    private int V;
    private ArrayList<ArrayList<Integer>> adj;

    GraphTopo(int v){
        V = v;
        adj = new ArrayList<ArrayList<Integer>>();

        for(int i =0; i<v; i++){
            adj.add(new ArrayList<>());
        }
    }

    void addEdge(int u, int v){
        adj.get(u).add(v);
    }

    void dfs(Integer i, boolean[] visited, Stack<Integer> stack){
        visited[i] = true;
        Integer n;

        Iterator<Integer> it = adj.get(i).iterator();
        while (it.hasNext()){
            n = it.next();
            if(!visited[n]){
                dfs(n, visited, stack);
            }

        }
        stack.push(i);
    }

    void toposort(){
        Stack<Integer> stack = new Stack<>();
        boolean[] visited = new boolean[V];
        for(int i=0; i<V; i++){
            visited[i] = false;
        }

        for(int i=0; i<V; i++){
            if (!visited[i]) {
                dfs(i, visited, stack);
            }
        }

        while (!stack.empty()){
            System.out.print((char)('a' + stack.pop()) + " ");
        }
    }

    public static void main(String[] args){
        GraphTopo g = new GraphTopo(6);
        g.addEdge(5, 2);
        g.addEdge(5, 0);
        g.addEdge(4, 0);
        g.addEdge(4, 1);
        g.addEdge(2, 3);
        g.addEdge(3, 1);

        System.out.println("Following is a Topological "
                + "sort of the given graph");
        // Function Call
        g.toposort();

    }

}
