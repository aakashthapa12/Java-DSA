public class DFS{
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
    
    public static void printAllPaths(ArrayList<Edge>[] graph, int src, int dest,boolean []vis, String psf){
        if(src == dest){
            System.out.println(psf);
            return;
        }

        vis[src] = true;
        for(Edge edge: graph[src]){
            if(vis[edge.dest] == false){
                printAllPaths(graph, edge.dest, dest, vis, psf + edge.dest);
            }
        }
        vis[src] = false;
    }
    public static void main(String args[]){
        ArrayList<Edge>[] graph = new ArrayList[7];
        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1, 1));
        graph[0].add(new Edge(0, 2, 1));

        graph[1].add(new Edge(1, 0, 1));
        graph[1].add(new Edge(1, 3, 1));

        graph[2].add(new Edge(2, 0, 1));
        graph[2].add(new Edge(2, 4, 1));

        graph[3].add(new Edge(3, 1, 1));
        graph[3].add(new Edge(3, 4, 1));
        graph[3].add(new Edge(3, 5, 1));

        graph[4].add(new Edge(4, 2, 1));
        graph[4].add(new Edge(4, 3, 1));
        graph[4].add(new Edge(4, 5, 1));

        graph[5].add(new Edge(5, 3, 1));
        graph[5].add(new Edge(5, 4, 1));
        graph[5].add(new Edge(5, 6, 1));
        graph[6].add(new Edge(6, 5, 1));

        boolean []vis = new boolean[7];
        printAllPaths(graph, 0, 6, vis, 0 + "");
    }
}