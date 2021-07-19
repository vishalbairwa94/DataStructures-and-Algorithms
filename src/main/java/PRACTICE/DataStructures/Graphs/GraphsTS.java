package PRACTICE.DataStructures.Graphs;

import javax.swing.text.html.HTMLDocument;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeSet;

//implementation of graphs using treeset and hashmaps
public class GraphsTS {
    static int v;
    private HashMap<Integer, TreeSet<Integer>> adj;

    GraphsTS(){
        adj = new HashMap<>();
        for(int i=0; i<v; i++){
            adj.put(i, new TreeSet<>());
        }

    }

    void addEdge(int src, int dest){
        adj.get(src).add(dest);
        adj.get(dest).add(src);
    }

    void searchEdge(int src, int dest){
        Iterator i = adj.get(src).iterator();

        if(adj.get(src).contains(dest)){
            System.out.println("Edge from " + src + " to " + dest + " found");
        }
        else{
            System.out.println("edge from " + src + " to " + dest + " not found");
        }
        System.out.println();
    }

    void printGraph(){
        for (int i=0; i<v;i++){
            System.out.println("Adjacency list of vertex " + i);
            Iterator it = adj.get(i).iterator();
            while (it.hasNext()){
                System.out.print(it.next() + " ");
            }
            System.out.println();
            System.out.println();
        }
    }
    public static void main(String args[]){
        v = 5;
        GraphsTS graph = new GraphsTS();

        graph.addEdge(0, 1);
        graph.addEdge(0, 4);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);

        // Print the adjacency list representation of
        // the above graph
        graph.printGraph();

        // Search the given edge in the graph
        graph.searchEdge(2, 1);
        graph.searchEdge(0, 3);

    }

}
