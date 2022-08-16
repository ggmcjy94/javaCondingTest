package fastcampus.chapter2.greedy;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;


class Edge implements Comparable<Edge> {

    Integer distance;
    String vertex;

    public Edge(Integer distance, String vertex) {
        this.distance = distance;
        this.vertex = vertex;
    }

    @Override
    public int compareTo(Edge o) {
        return this.distance - o.distance;
    }
}

public class 탐욕알고리즘02 {

    public static void main(String[] args) {
        Edge edge1 = new Edge(10, "A");
        Edge edge2 = new Edge(12, "A");
        Edge edge3 = new Edge(13,"A");
        Edge[] edges = new Edge[]{edge1,edge2,edge3};
        Arrays.sort(edges, new Comparator<Edge>() { // 중복될경우 Comparator 이걸로 덮어 써짐
            @Override
            public int compare(Edge o1, Edge o2) {
                return o2.distance - o1.distance;
            }
        });
        for (int i=0; i<edges.length; i++) {
            System.out.println(edges[i].distance);
        }
    }
}
