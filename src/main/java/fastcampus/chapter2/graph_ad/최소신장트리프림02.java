package fastcampus.chapter2.graph_ad;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.PriorityQueue;

/**
 * 프림 알고리즘 개선
 * 다익스트라 랑 비슷
 */

class Edge2 implements Comparable<Edge2> {

    String node;
    int weight;

    public Edge2(String node, int weight) {
        this.node = node;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "(" + this.weight + ", " + this.node + ")";
    }

    @Override
    public int compareTo(Edge2 o) {
        return this.weight - o.weight;
    }
}

class Path {
    String node1;
    String node2;
    int weight;

    public Path(String node1, String node2, int weight) {
        this.node1 = node1;
        this.node2 = node2;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "(" + this.node1 + "," + this.node2 + ","+ this.weight +")";
    }
}


public class 최소신장트리프림02 {


    private ArrayList<Path> imporvedPrimFunc (HashMap<String, HashMap<String, Integer>> graph, String startNode) {
        ArrayList<Path> mst = new ArrayList<Path>();
        PriorityQueue<Edge2> keys = new PriorityQueue<Edge2>();
        HashMap<String, Edge2> keysObjects = new HashMap<String, Edge2>();
        HashMap<String, String> mstPath = new HashMap<String, String>();
        Integer totalWeight = 0;
        HashMap<String, Integer> linkedEdges;
        Edge2 edgeObject, poppedEdge, linkedEdge;


        for (String key : graph.keySet()) {
            if (key == startNode) {
                edgeObject = new Edge2(key, 0);
                mstPath.put(key,key);
            } else {
                edgeObject = new Edge2(key,Integer.MAX_VALUE);
                mstPath.put(key,null);
            }
            keys.add(edgeObject);
            keysObjects.put(key, edgeObject);
        }

        while (!keys.isEmpty()) {
            poppedEdge = keys.poll();
            keysObjects.remove(poppedEdge.node); // 같이 삭제

            mst.add(new Path(mstPath.get(poppedEdge.node),poppedEdge.node, poppedEdge.weight));
            totalWeight += poppedEdge.weight;


            linkedEdges = graph.get(poppedEdge.node);
            for (String adjacent : linkedEdges.keySet()) {
                if (keysObjects.containsKey(adjacent)) {
                    linkedEdge = keysObjects.get(adjacent);

                    if (linkedEdges.get(adjacent) < linkedEdge.weight) {
                        linkedEdge.weight = linkedEdges.get(adjacent);
                        mstPath.put(adjacent, poppedEdge.node);

                        keys.remove(linkedEdge);
                        keys.add(linkedEdge);
                    }
                }
            }
        }
        return mst;
    }


    public static void main(String[] args) {
        최소신장트리프림02 T = new 최소신장트리프림02();
        HashMap<String, HashMap<String, Integer>> mygraph = new HashMap<>();
        HashMap<String, Integer> edges;

        edges = new HashMap<String, Integer>();
        edges.put("B", 7);
        edges.put("D", 5);
        mygraph.put("A", edges);

        edges = new HashMap<String, Integer>();
        edges.put("A", 7);
        edges.put("D", 9);
        edges.put("C", 8);
        edges.put("E", 7);
        mygraph.put("B", edges);

        edges = new HashMap<String, Integer>();
        edges.put("B", 8);
        edges.put("E", 5);
        mygraph.put("C", edges);

        edges = new HashMap<String, Integer>();
        edges.put("A", 5);
        edges.put("B", 9);
        edges.put("E", 7);
        edges.put("F", 6);
        mygraph.put("D", edges);

        edges = new HashMap<String, Integer>();
        edges.put("B", 7);
        edges.put("C", 5);
        edges.put("D", 7);
        edges.put("F", 8);
        edges.put("G", 9);
        mygraph.put("E", edges);

        edges = new HashMap<String, Integer>();
        edges.put("D", 6);
        edges.put("E", 8);
        edges.put("G", 11);
        mygraph.put("F", edges);

        edges = new HashMap<String, Integer>();
        edges.put("E", 9);
        edges.put("F", 11);
        mygraph.put("G", edges);

        System.out.println(T.imporvedPrimFunc(mygraph, "A"));
    }

}
