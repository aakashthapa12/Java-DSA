import java.util.*;
public class PerfectFriendsProblem{
    public static class Edge {
        int v;
        int n;

        Edge(int v, int n){
            this.v = v;
            this.n = n;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);  

        int n = sc.nextInt();
        int k = sc.nextInt();

        ArrayList<Edge> []graph = new ArrayList[n];
        for(int v=0; v<n; v++){
            graph[v] = new ArrayList<>();
        }

        for(int e=0; e<k; e++){
            int v1 = sc.nextInt();
            int v2 = sc.nextInt();

            graph[v1].add(new Edge(v1,v2));
            graph[v2].add(new Edge(v2,v1));
        }

        boolean []vis = new boolean[n];
        ArrayList<ArrayList<Integer>> comps = new ArrayList<>();
        for(int v=0; v<n; v++){
            if(vis[v] == false){
                ArrayList<Integer> comp = new ArrayList<>();
                generateComponents(graph, v, comp, vis);
                comps.add(comp);
            }
        }

        int pairs = 0;
        for(int i=0; i<comps.size(); i++){
            for(int j=i+1; j<comps.size(); j++){
                int count = comps.get(i).size() * comps.get(j).size();
                pairs += count;
            }   
        }
        System.out.print(pairs);
    }

    public static void generateComponents(ArrayList<Edge>[]graph, int v, ArrayList<Integer>comp, boolean[]vis){
        vis[v] = true;
        comp.add(v);
        for(Edge e: graph[v]){
             if(vis[e.n] == false){
                generateComponents(graph, e.n, comp, vis);
            }
        }
    }
}