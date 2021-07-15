package PRACTICE.DataStructures.Graphs;

import java.util.Iterator;
import java.util.LinkedList;

public class GraphDfs {
    private int V;
    private LinkedList<Integer> adj[];

    GraphDfs(int v){
        V = v;
        adj = new LinkedList[v];
        for(int i =0; i<v; i++){
            adj[i] = new LinkedList<>();
        }
    }

    void addEdge(int u, int v){
        adj[u].add(v);
    }

    void DfsUtil(int n, boolean visited[]){
        visited[n] = true;
        System.out.print(n + " ");

        Iterator<Integer> i = adj[n].listIterator();
        while (i.hasNext()){
            int v = i.next();
            if(!visited[v]){
                DfsUtil(v, visited);
            }
        }
    }

    void Dfs(int n){
        boolean visited[] = new boolean[V];

        DfsUtil(n, visited);
    }

    public static void main(String args[]){
        GraphDfs g = new GraphDfs(4);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        System.out.println(
                "Following is Depth First Traversal "
                        + "(starting from vertex 2)");

        g.Dfs(2);
    }
}
