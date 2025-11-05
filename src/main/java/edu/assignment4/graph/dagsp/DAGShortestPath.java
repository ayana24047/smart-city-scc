package edu.assignment4.graph.dagsp;

import edu.assignment4.metrics.Metrics;
import java.util.List;
import java.util.ArrayList;  // Для создания экземпляров ArrayList
import java.util.Arrays;  // Для работы с Arrays.fill
// Импортируем Metrics

public class DAGShortestPath {
    private Metrics metrics;  // Поле для хранения метрик

    // Конструктор, принимающий объект Metrics
    public DAGShortestPath(Metrics metrics) {
        this.metrics = metrics;
    }

    public List<Integer> shortestPath(List<List<Integer>> graph, int source) {
        int n = graph.size();
        int[] dist = new int[n];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[source] = 0;

        for (int u = 0; u < n; u++) {
            for (int v : graph.get(u)) {
                if (dist[u] != Integer.MAX_VALUE && dist[u] + 1 < dist[v]) {
                    dist[v] = dist[u] + 1;  // Простой случай без весов
                    metrics.incrementEdgeRelaxations();  // Увеличиваем количество релаксаций рёбер
                }
            }
        }

        List<Integer> result = new ArrayList<>();
        for (int d : dist) {
            result.add(d);
        }

        return result;
    }
}
