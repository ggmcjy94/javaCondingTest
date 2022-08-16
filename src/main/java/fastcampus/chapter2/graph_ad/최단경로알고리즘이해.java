package fastcampus.chapter2.graph_ad;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.PriorityQueue;


/**
 * 다익스트라 알고리즘
 * 1. 단일 출발 (single-source) 최단 경로 문제 <----
 *   - 그래프 내의 특정 노드 u 에서 출발하여, 그래프 내의 모든 다른 노드에 도착하는 가장 짧은 경로를 찾는 문제
 *
 * 2. 단일 도착 (single-destination) 최단 경로 문제
 *   - 모든 노드들로부터 출발해서, 그래프 내의 특정 노드 u 로 도착하는 가장 짧은 경로를 찾는 문제
 * 3. 단일 쌍(single-pair) 최단 경로 문제
 *   - 주어진 노드 u 와 v 간의 최단 경로를 찾는 문제
 * 4. 전체 쌍(all-pair) 최단 경로: 그래프 내의 모든 노드 쌍 (u, v) 사이에 대한 최단 경로를 찾는 문제
 */

class Edge implements Comparable<Edge> {

    public int distance;
    public String vertex;

    public Edge(int distance, String vertex) {
        this.distance = distance;
        this.vertex = vertex;
    }

    @Override
    public String toString() {
        return "vertex: " + this.vertex + ", distance: " + this.distance;
    }

    @Override
    public int compareTo(Edge o) {
        return this.distance - o.distance;
    }
}
public class 최단경로알고리즘이해 {
    private HashMap<String, Integer> dijkstraFunc(HashMap<String, ArrayList<Edge>> graph, String start) {
        Edge edgeNode, adjacentNode;
        ArrayList<Edge> nodeList;
        int currentDistance, weight, distance;
        String currNode, adjacent;

        HashMap<String, Integer> distances = new HashMap<>();
        for (String key : graph.keySet()) {
            distances.put(key, Integer.MAX_VALUE);
        }
        distances.put(start, 0);

        PriorityQueue<Edge> priorityQueue = new PriorityQueue<>();
        priorityQueue.offer(new Edge(distances.get(start), start));

        while (priorityQueue.size() > 0) {
            edgeNode = priorityQueue.poll();
            currentDistance = edgeNode.distance;
            currNode = edgeNode.vertex;

            if (distances.get(currNode) < currentDistance) {
                continue;
            }

            nodeList = graph.get(currNode);
            for (int i = 0; i < nodeList.size(); i++) {
                adjacentNode = nodeList.get(i);
                adjacent = adjacentNode.vertex;
                weight = adjacentNode.distance;

                distance = currentDistance + weight;

                if (distance < distances.get(adjacent)) {
                    distances.put(adjacent, distance);
                    priorityQueue.offer(new Edge(distance, adjacent));
                }
            }
        }
        return distances;
    }
    public static void main(String[] args) {
        최단경로알고리즘이해 T = new 최단경로알고리즘이해();
        HashMap<String, ArrayList<Edge>> graph = new HashMap<String, ArrayList<Edge>>();
        graph.put("A", new ArrayList<>(Arrays.asList(new Edge(8, "B"), new Edge(1, "C"), new Edge(2, "D"))));
        graph.put("B", new ArrayList<>());
        graph.put("C", new ArrayList<>(Arrays.asList(new Edge(5, "B"), new Edge(2, "D"))));
        graph.put("D", new ArrayList<>(Arrays.asList(new Edge(3, "E"), new Edge(5, "F"))));
        graph.put("E", new ArrayList<>(Arrays.asList(new Edge(1, "F"))));
        graph.put("F", new ArrayList<>(Arrays.asList(new Edge(5, "A"))));

        System.out.println(T.dijkstraFunc2(graph, "A"));
    }

    private HashMap<String, Integer> dijkstraFunc2(HashMap<String, ArrayList<Edge>> graph, String startNode) {
        Edge edgeNode, adjacentNode;
        ArrayList<Edge> nodeList;
        int currentDistance, weight, distance;
        String currNode, adjacent;
        HashMap<String, Integer> distances = new HashMap<>();

        for (String key : graph.keySet()) {
            distances.put(key, Integer.MAX_VALUE);
        }
        distances.put(startNode, 0);

        PriorityQueue<Edge> priorityQueue = new PriorityQueue<>();
        priorityQueue.offer(new Edge(distances.get(startNode), startNode));

        while (!priorityQueue.isEmpty()) {
            edgeNode = priorityQueue.poll();
            currentDistance = edgeNode.distance;
            currNode = edgeNode.vertex;
            if (distances.get(currNode) < currentDistance) {
                continue;
            }
            
            nodeList = graph.get(currNode);
            for (int i = 0; i < nodeList.size(); i++) {
                adjacentNode = nodeList.get(i);
                adjacent = adjacentNode.vertex;
                weight = adjacentNode.distance;

                distance = currentDistance + weight;

                if (distance < distances.get(adjacent)) {
                    distances.put(adjacent, distance);
                    priorityQueue.offer(new Edge(distance, adjacent));
                }
            }
        }
        return distances;
    }
}
