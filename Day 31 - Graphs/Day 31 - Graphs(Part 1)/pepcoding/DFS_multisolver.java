import java.util.*;
public class DFS_multisolver{
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

    static class Pair implements Comparable<Pair>{
        String psf;
        int wsf;

        Pair(String psf, int wsf){
            this.psf = psf;
            this.wsf = wsf;
        }

        @Override
        public int compareTo(Pair p2){
            return this.wsf - p2.wsf;
        }
    }
    
    public static void main(String args[]){
        ArrayList<Edge>[] graph = new ArrayList[7];
        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1, 10));
        graph[0].add(new Edge(0, 3, 40));

        graph[1].add(new Edge(1, 2, 10));
        // graph[1].add(new Edge(1, 3, 1));

        graph[2].add(new Edge(2, 3, 10));
        // graph[2].add(new Edge(2, 4, 1));

        // graph[3].add(new Edge(3, 1, 1));
        graph[3].add(new Edge(3, 4, 2));
        // graph[3].add(new Edge(3, 5, 1));

        // graph[4].add(new Edge(4, 2, 1));
        graph[4].add(new Edge(4, 5, 3));
        graph[4].add(new Edge(4, 6, 8));

        graph[5].add(new Edge(5, 6, 3));
        // graph[5].add(new Edge(5, 3, 1));
        // graph[5].add(new Edge(5, 4, 1));
        // graph[6].add(new Edge(6, 5, 1));

        boolean []vis = new boolean[7];
        int weight = 40;
        int k = 3;
        multisolver(graph, 0, 6, vis, weight, k, 0 + "", 0);

        System.out.println("Smallest Path = "+spath+" @"+spathwt);
        System.out.println("Largest Path = "+lpath+" @"+lpathwt);
        System.out.println("Just Larger Path than/Ceil Path "+weight+" = "+cpath+" @"+cpathwt);
        System.out.println("Just Smaller Path than/Floor Path "+weight+" = "+fpath+" @"+fpathwt);
        System.out.println(k+" Largest Path = "+pq.peek().psf+" @"+pq.peek().wsf);
    }

    static String spath;
    static int spathwt = Integer.MAX_VALUE;
    static String lpath;
    static int lpathwt = Integer.MIN_VALUE;
    static String cpath;
    static int cpathwt = Integer.MAX_VALUE;
    static String fpath;
    static int fpathwt = Integer.MIN_VALUE;
    static PriorityQueue<Pair> pq = new PriorityQueue<>();

    public static void multisolver(ArrayList<Edge>[] graph, int src, int dest, boolean []vis, int weight, int k, String psf, int wsf){
        if(src == dest){
            if(wsf < spathwt){
                spathwt = wsf;
                spath = psf;
            }
            if(wsf > lpathwt){
                lpathwt = wsf;
                lpath = psf;
            }
            if(wsf > weight && wsf < cpathwt){
                cpathwt = wsf;
                cpath = psf;
            }
            if(wsf < weight && wsf > fpathwt){
                fpathwt = wsf;
                fpath = psf;
            }

            if(pq.size()<k){
                pq.add(new Pair(psf,wsf));
            }
            else{
                if(pq.peek().wsf<wsf){
                    pq.remove();
                    pq.add(new Pair(psf,wsf));
                }
            }
            return;
        }

        vis[src] = true;
        for(Edge e: graph[src]){
            if(vis[e.dest] == false){
                multisolver(graph, e.dest, dest, vis, weight, k, psf + e.dest, wsf+e.wt);
            }
        }
        vis[src] = false;
    }
}