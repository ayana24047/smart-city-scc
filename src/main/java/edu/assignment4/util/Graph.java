package edu.assignment4.util;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class Graph {
    @JsonProperty("name")
    private String name;

    @JsonProperty("directed")
    private boolean directed;

    @JsonProperty("n")
    private int n;

    @JsonProperty("edges")
    private List<Edge> edges;

    @JsonProperty("source")
    private int source;

    @JsonProperty("weight_model") // Для JSON использует "weight_model"
    private String weightModel;

    // Геттеры и сеттеры
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isDirected() {
        return directed;
    }

    public void setDirected(boolean directed) {
        this.directed = directed;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public List<Edge> getEdges() {
        return edges;
    }

    public void setEdges(List<Edge> edges) {
        this.edges = edges;
    }

    public int getSource() {
        return source;
    }

    public void setSource(int source) {
        this.source = source;
    }

    public String getWeightModel() {
        return weightModel;
    }

    public void setWeightModel(String weightModel) {
        this.weightModel = weightModel;
    }

    // Вложенный класс для рёбер графа
    public static class Edge {
        private int u;
        private int v;
        private int w;

        // Геттеры и сеттеры
        public int getU() {
            return u;
        }

        public void setU(int u) {
            this.u = u;
        }

        public int getV() {
            return v;
        }

        public void setV(int v) {
            this.v = v;
        }

        public int getW() {
            return w;
        }

        public void setW(int w) {
            this.w = w;
        }

        // Переопределяем метод toString, чтобы выводить данные ребра
        @Override
        public String toString() {
            return "Edge{" +
                    "u=" + u +
                    ", v=" + v +
                    ", w=" + w +
                    '}';
        }
    }
}
