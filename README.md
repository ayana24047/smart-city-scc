# Smart City / Smart Campus Scheduling

This project implements algorithms to solve the **Smart City / Smart Campus Scheduling** problem, which aims to schedule city-service tasks (e.g., street cleaning, repairs, camera/sensor maintenance) based on their dependencies.

## Course Topics Covered
- **Strongly Connected Components (SCC) & Topological Ordering**
- **Shortest Paths in Directed Acyclic Graphs (DAGs)**

## 1. Algorithms and Their Implementation

### 1.1 Strongly Connected Components (SCC)
- **Algorithm**: **Tarjan’s Algorithm**
- **Input**: Directed graph (tasks)
- **Output**: List of SCCs

**Example Output**:Strongly Connected Components: [[2, 1, 0], [5, 4, 3]]

### 1.2 Topological Sorting
- **Algorithm**: **Topological Sort** (DFS / Kahn's Algorithm)
- **Output**: Valid topological order of the SCC condensation graph.

### 1.3 Shortest Paths in a DAG
- **Algorithm**: **Single-source shortest path** algorithm
- **Weight Model**: Edge weights (as described in JSON files)
- **Output**: Shortest and longest paths in the DAG.

## 2. Dataset Generation

### 2.1 Graph Categories:
- **Small Graphs (6–10 nodes)**: Simple cases with 1–2 cycles or pure DAG.
- **Medium Graphs (10–20 nodes)**: Mixed structures with multiple SCCs.
- **Large Graphs (20–50 nodes)**: Performance and timing tests.

### 2.2 Example Graphs:

| **Graph**                        | **Nodes (n)** | **Edges** | **Description**                    | **Cyclic** | **SCCs** |
|----------------------------------|---------------|-----------|------------------------------------|------------|----------|
| Simple Cycle                     | 6             | 6         | Simple cycle graph                 | Yes        | 1        |
| Simple DAG                       | 6             | 5         | Simple directed acyclic graph (DAG)| No         | 1        |
| Cycle with Multiple SCC          | 8             | 7         | Graph with multiple SCCs           | Yes        | 2        |
| Dense Graph with Cycles          | 10            | 10        | Dense graph with cycles            | Yes        | 3        |

### 2.3 Graph Types:
- **Cyclic Graphs**: Graphs with cycles and SCCs.
- **Acyclic Graphs (DAG)**: Graphs without cycles, ideal for task scheduling.

## 3. Results and Metrics

### 3.1 Metrics Collected:
- **DFS Visits**: Number of DFS visits to vertices during SCC discovery.
- **Edge Relaxations**: Number of edge relaxations during shortest path calculation.
- **Topological Sort Operations**: Operations performed during topological sorting.

## 4. Running the Project

### 4.1 Prerequisites:
- **Java 17** or above
- **Maven** for dependency management

### 4.2 How to Run:
1. Clone the repository:
   ```bash
   git clone https://github.com/ayana24047/smart-city-scc.git




<img width="529" height="634" alt="image" src="https://github.com/user-attachments/assets/5e91f56c-e402-4e77-8cc7-ff50f95dd5bc" />
