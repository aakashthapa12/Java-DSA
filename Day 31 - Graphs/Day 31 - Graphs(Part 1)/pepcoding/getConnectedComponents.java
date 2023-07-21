import java.util.*;
public class getConnectedComponents{
    static class Edge{
        int sr;
        int dest;
        int wt;

        Edge(int sr, int dest, int wt){
            this.sr = sr;
            this.dest = dest;
            this.wt = wt;
        }
    }

    public static void createGraph(ArrayList<Edge>[] graph){
        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1, 10));
        graph[1].add(new Edge(1, 0, 10));

        graph[2].add(new Edge(2, 3, 10));
        graph[3].add(new Edge(3, 2, 10));

        graph[4].add(new Edge(4, 5, 10));
        graph[4].add(new Edge(4, 6, 10));
        graph[5].add(new Edge(5, 6, 10));

    }
    
    public static void main(String args[]){
        int vertices = 7;
        ArrayList<Edge>[] graph= new ArrayList[vertices];
        createGraph(graph);

        ArrayList<ArrayList<Integer>> comps = new ArrayList<>();
        boolean []vis = new boolean[vertices];
        for(int v=0; v<vertices; v++){
            if(vis[v] == false){
                ArrayList<Integer> comp = new ArrayList<>();
                generateComponents(graph, v, comp, vis);
                comps.add(comp);
            }
        }

        System.out.print(comps);
    }
    
    public static void generateComponents(ArrayList<Edge>[]graph, int src, ArrayList<Integer> comp, boolean[]vis){
        vis[src] = true;
        comp.add(src);
        for(Edge e: graph[src]){
            if(vis[e.dest] == false){
                generateComponents(graph, e.dest, comp, vis);
            }
        }
    }
}