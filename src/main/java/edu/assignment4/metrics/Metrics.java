package edu.assignment4.metrics;

public class Metrics {

    // Переменные для подсчета операций
    private int dfsVisits = 0;   // Количество посещений вершин в DFS
    private int edgeRelaxations = 0; // Количество релаксаций рёбер
    private int topoSortOps = 0; // Количество операций в топологической сортировке

    // Метод для инкремента подсчета посещений вершин
    public void incrementDFSVisits() {
        dfsVisits++;
    }

    // Метод для инкремента подсчета релаксаций рёбер
    public void incrementEdgeRelaxations() {
        edgeRelaxations++;
    }

    // Метод для инкремента операций в топологической сортировке
    public void incrementTopoSortOps() {
        topoSortOps++;
    }

    // Метод для вывода текущих метрик
    public void printMetrics() {
        System.out.println("DFS Visits: " + dfsVisits);
        System.out.println("Edge Relaxations: " + edgeRelaxations);
        System.out.println("Topological Sort Operations: " + topoSortOps);
    }

    // Геттеры для метрик
    public int getDfsVisits() {
        return dfsVisits;
    }

    public int getEdgeRelaxations() {
        return edgeRelaxations;
    }

    public int getTopoSortOps() {
        return topoSortOps;
    }
}
