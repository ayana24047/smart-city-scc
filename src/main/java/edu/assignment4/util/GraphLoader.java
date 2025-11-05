package edu.assignment4.util;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class GraphLoader {

    // Метод для загрузки всех графов из файла
    public static List<Graph> loadGraphs(String filePath) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        // Загружаем JSON как объект GraphData
        GraphData graphData = mapper.readValue(new File(filePath), GraphData.class);

        // Возвращаем список всех графов
        return graphData.getGraphs();
    }

    // Классы для парсинга JSON данных
    public static class GraphData {
        private List<Graph> graphs; // Список графов

        public List<Graph> getGraphs() {
            return graphs;
        }

        public void setGraphs(List<Graph> graphs) {
            this.graphs = graphs;
        }
    }
}
