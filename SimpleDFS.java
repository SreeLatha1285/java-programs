import java.util.*;
public class SimpleDFS {
    private int vertices;
    private LinkedList<Integer>[] adjList;
    public SimpleDFS(int v) {
        vertices = v;
        adjList = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            adjList[i] = new LinkedList<>();
        }
    }
    public void addEdge(int src, int dest) {
        adjList[src].add(dest);
        adjList[dest].add(src); 
    }
    private void dfs(int vertex, boolean[] visited) {
        visited[vertex] = true;
        System.out.print(vertex + " ");
        for (int neighbor : adjList[vertex]) {
            if (!visited[neighbor]) {
                dfs(neighbor, visited);
            }
        }
    }
    public void dfsTraversal(int startVertex) {
        boolean[] visited = new boolean[vertices];
        System.out.print("DFS starting from vertex " + startVertex + ": ");
        dfs(startVertex, visited);
        System.out.println();
    }
    public static void main(String[] args) {
        SimpleDFS graph = new SimpleDFS(5);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 4);
        graph.dfsTraversal(0);
    }
}
