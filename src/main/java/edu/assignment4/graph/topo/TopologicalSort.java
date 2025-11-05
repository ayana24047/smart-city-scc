package edu.assignment4.graph.topo;

import java.util.*;

public class TopologicalSort {
    public List<Integer> sort(List<List<Integer>> graph) {
        int n = graph.size();
        int[] inDegree = new int[n];
        for (List<Integer> neighbors : graph) {
            for (int v : neighbors) {
                inDegree[v]++;
            }
        }

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            if (inDegree[i] == 0) {
                queue.offer(i);
            }
        }

        List<Integer> topoOrder = new ArrayList<>();
        while (!queue.isEmpty()) {
            int u = queue.poll();
            topoOrder.add(u);
            for (int v : graph.get(u)) {
                if (--inDegree[v] == 0) {
                    queue.offer(v);
                }
            }
        }

        return topoOrder;
    }
}
