# smart-city-scc
Assignment 4 Report: Smart City

This report outlines the implementation and analysis of algorithms used for solving the "Smart City / Smart Campus Scheduling" problem. The project consolidates two key course topics:

Strongly Connected Components (SCC) & Topological Ordering

Shortest Paths in Directed Acyclic Graphs (DAGs)

The goal is to schedule city-service tasks (e.g., street cleaning, repairs, camera/sensor maintenance) based on their dependencies. Some tasks are cyclic (detect and compress them), while others are acyclic (optimize the schedule).

2. Algorithms and Their Implementation
2.1 Strongly Connected Components (SCC)

Algorithm Used: Tarjan's Algorithm for finding Strongly Connected Components (SCCs) in a directed graph.

Input: A directed graph (e.g., street cleaning tasks, repairs, etc.).

Output: A list of SCCs, where each SCC is a set of vertices that form a strongly connected component.

Graph Representation: Each graph is represented as an adjacency list.

SCC Example Output:
Strongly Connected Components: [[2, 1, 0], [5, 4, 3]]

2.2 Topological Sorting

Algorithm Used: Topological Sort using Depth-First Search (DFS) or Kahn’s Algorithm.

Output: A valid topological order of the SCC condensation graph, along with the derived order of original tasks after SCC compression.

Topological Sort Example Output:
Topological Sort Order: [SCC1, SCC2, SCC3]

2.3 Shortest Paths in a DAG

Algorithm Used: Single-source shortest path algorithm on the Directed Acyclic Graph (DAG).

Weight Model: The graph uses edge weights (documented in the JSON files).

Shortest Path: From a given source vertex, the shortest path to each other vertex is computed.

Longest Path: The longest path is determined by sign inversion or max-DP over the topological order.

Example Output:

Critical path: [4 -> 5 -> 6]

Length of critical path: 10

3. Dataset Generation

The datasets used for testing algorithms are generated to represent different structures and sizes of graphs.

3.1 Graph Categories:

Small Graphs (6–10 nodes): Simple cases, 1–2 cycles or pure DAG

Example: Graph 1 - Simple Cycle (6 nodes, 6 edges, cyclic)

Medium Graphs (10–20 nodes): Mixed structures, several SCCs

Example: Graph 3 - Cycle with Multiple SCC (8 nodes, 7 edges, cyclic)

Large Graphs (20–50 nodes): Performance and timing tests

Example: Graph 7 - Large Sparse DAG (15 nodes, 13 edges, acyclic)


Cyclic Graphs: Graphs that contain cycles and SCCs.

Acyclic Graphs (DAG): Graphs without cycles, often used for optimal task scheduling.
<img width="576" height="540" alt="image" src="https://github.com/user-attachments/assets/9bc05443-e47d-48ca-99cb-36689a9c613d" />

4. Results and Metrics

The performance of the algorithms was measured by tracking various metrics. Below are the metrics collected during the execution of the algorithms.

4.1 Metrics Collected:

DFS Visits: Number of DFS visits to vertices during SCC discovery.

Edge Relaxations: Number of edge relaxations for shortest path calculations.

Topological Sort Operations: Number of operations performed during topological sorting.

<img width="682" height="504" alt="image" src="https://github.com/user-attachments/assets/5e3f7b3d-579c-4dd6-a74e-086e729e20b0" />
5. Analysis
5.1 Bottlenecks and Effects of Structure:

Cyclic Graphs: Graphs with cycles, such as Graph 1 and Graph 3, cause additional overhead in the SCC algorithm as the cycles need to be detected and compressed.

Sparse vs Dense Graphs: Sparse graphs (e.g., Graph 5) typically take less time to process due to fewer edges. In contrast, dense graphs (e.g., Graph 4) may cause performance bottlenecks due to the increased number of edges and required operations for shortest paths.

5.2 Effect of SCC Sizes:

Graphs with multiple SCCs, like Graph 8, show a more complex structure, requiring more operations to process and sort the components, impacting both SCC and topological sorting times.

6. Conclusion

The algorithms implemented for SCC, Topological Sorting, and Shortest Path Calculation perform well on various graph structures.

Use of SCC: SCC helps compress cyclic structures into simpler components, making it easier to plan tasks for cyclic dependencies.

Topological Sorting: Provides an optimal ordering of tasks when dependencies are acyclic, ensuring tasks are executed in the correct order.

Shortest Paths: Helps in identifying critical paths for scheduling and optimization of time-sensitive tasks.

Practical Recommendations:

For tasks with simple dependencies, using DAGs (without cycles) would be more efficient.

For more complex dependency structures, especially with cycles, SCC should be used to break down the problem into smaller components.

For large datasets, consider parallelizing or optimizing the algorithms to reduce time complexity.


<img width="529" height="634" alt="image" src="https://github.com/user-attachments/assets/5e91f56c-e402-4e77-8cc7-ff50f95dd5bc" />
