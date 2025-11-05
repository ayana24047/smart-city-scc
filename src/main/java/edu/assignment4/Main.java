package edu.assignment4;

import edu.assignment4.metrics.Metrics;
import edu.assignment4.graph.scc.TarjanSCC;
import edu.assignment4.util.Graph;
import edu.assignment4.util.GraphLoader;

import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Metrics metrics = new Metrics();

        try {
            // Загружаем все графы из файла
            List<Graph> graphs = GraphLoader.loadGraphs("src/main/resources/data/tasks.json");

            // Обрабатываем каждый граф
            for (Graph graph : graphs) {
                System.out.println("Processing graph: " + graph.getWeightModel());
                System.out.println("Graph adjacency list: " + graph.getEdges());

                // Создаем экземпляр TarjanSCC с переданными метриками
                TarjanSCC tarjan = new TarjanSCC(metrics);

                // Находим компоненты сильной связности
                List<List<Integer>> sccs = tarjan.findSCC(graph.getEdges()); // передаем рёбра

                // Печатаем компоненты сильной связности
                System.out.println("Strongly Connected Components: " + sccs);

                // Печатаем метрики
                metrics.printMetrics();
            }
        } catch (IOException e) {
            System.err.println("Error loading graph data: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
