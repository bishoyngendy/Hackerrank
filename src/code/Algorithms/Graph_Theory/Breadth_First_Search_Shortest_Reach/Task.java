package code.Algorithms.Graph_Theory.Breadth_First_Search_Shortest_Reach;

import code.InputReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Task {
    private boolean[] visited;
    private int[] distance;
    private List<List<Integer>> graph;
    private Queue<Integer> queue;

    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int q = in.nextInt();
        while (q-- != 0) {
            int n = in.nextInt();
            int m = in.nextInt();

            initializeGraph(n);

            for (int i = 0; i < m; i++) {
                int from = in.nextInt();
                int to = in.nextInt();
                graph.get(from - 1).add(to - 1);
                graph.get(to - 1).add(from - 1);
            }

            int s = in.nextInt();
            queue.add(s - 1);
            visited[s - 1] = true;
            while (!queue.isEmpty()) {
                int curr = queue.poll();
                for (int i = 0; i < graph.get(curr).size(); i++) {
                    int child = graph.get(curr).get(i);
                    if (!visited[child]) {
                        visited[child] = true;
                        distance[child] = distance[curr] + 1;
                        queue.add(child);
                    }
                }
            }
            for (int i = 0; i < n; i++) {
                if (i != (s - 1)) {
                    if (distance[i] != 0) {
                        out.print(6 * distance[i] + " ");
                    } else {
                        out.print(-1 + " ");
                    }
                }
            }
            out.println();
        }
    }

    private void initializeGraph(int n) {
        graph = new ArrayList<>();
        visited = new boolean[n + 1];
        distance = new int[n + 1];
        queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }
    }
}
