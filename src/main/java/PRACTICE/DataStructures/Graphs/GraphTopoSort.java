package PRACTICE.DataStructures.Graphs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

public class GraphTopoSort {
    int V;
    ArrayList<ArrayList<Integer>> adj;

    GraphTopoSort(int v){
        V = v;
        adj = new ArrayList<ArrayList<Integer>>(v);
        for(int i= 0; i<v;i++){
            adj.add(new ArrayList<Integer>());
        }
    }

    void addEdge(int v, int w){
        adj.get(v).add(w);
    }

    void topoSortUtil(int s, boolean visited[], Stack<Integer> stack){
        visited[s] = true;
        Integer i;

        Iterator<Integer> it = adj.get(s).iterator();
        while (it.hasNext()){
            i = it.next();
            if(!visited[i]){
                topoSortUtil(i, visited, stack);
            }
        }
        stack.push(s);

    }

    void topSort(){
        Stack<Integer> stack = new Stack<>();

        boolean visited[] = new boolean[V];
        for(int i =0; i< V; i++){
            visited[i] = false;
        }
        for(int i= 0; i<V; i++){
            if(visited[i] == false){
                topoSortUtil(i, visited, stack);

            }


        }

        while (stack.empty() == false)
            System.out.print(stack.pop() + " ");
    }
    public static void main(String args[]){
        GraphTopoSort g = new GraphTopoSort(6);
        g.addEdge(5, 2);
        g.addEdge(5, 0);
        g.addEdge(4, 0);
        g.addEdge(4, 1);
        g.addEdge(2, 3);
        g.addEdge(3, 1);

        System.out.println("Following is a Topological "
                + "sort of the given graph");
        // Function Call
        g.topSort();

    }

}
