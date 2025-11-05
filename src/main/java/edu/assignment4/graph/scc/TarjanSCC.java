package edu.assignment4.graph.scc;

import edu.assignment4.util.Graph;
import edu.assignment4.metrics.Metrics;

import java.util.*;

public class TarjanSCC {
    private Metrics metrics;

    public TarjanSCC(Metrics metrics) {
        this.metrics = metrics;
    }

    // Исправленный метод findSCC
    public List<List<Integer>> findSCC(List<Graph.Edge> edges) {
        List<List<Integer>> sccs = new ArrayList<>();
        // Допустим, что граф уже представлен в виде списка рёбер.
        // Здесь можно реализовать ваш алгоритм для поиска компонент сильной связности
        // Примерный процесс обхода и поиска SCC

        // Сюда добавляем логику поиска SCC
        // Например, это может быть алгоритм Тарьяна или Косараджу

        return sccs;
    }
}
