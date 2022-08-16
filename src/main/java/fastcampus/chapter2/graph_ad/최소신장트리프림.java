package fastcampus.chapter2.graph_ad;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.PriorityQueue;

/**
 * 프림 알고리즘
 * 탐욕 알고리즘을 기초로 함
 *
 */

class PEdge implements Comparable<PEdge>{

    int weight;
    String node1;
    String node2;

    public PEdge(int weight, String node1, String node2) {
        this.weight = weight;
        this.node1 = node1;
        this.node2 = node2;
    }

    @Override
    public String toString() {
        return "(" + this.weight +"," + this.node1 +"," + this.node2 + ")";
    }

    @Override
    public int compareTo(PEdge o) {
        return this.weight - o.weight;
    }
}
public class 최소신장트리프림 {


    private ArrayList<PEdge> primFunc(String startNode, ArrayList<PEdge> edges) {
        PEdge currentEdge, poppedEdge, adjacentEdgesNode;
        ArrayList<PEdge> currentEdgeList, candidateEdgeList, adjacentEdgesNodes;
        ArrayList<String> connectedNodes = new ArrayList<>();
        ArrayList<PEdge> mst = new ArrayList<>();
        HashMap<String, ArrayList<PEdge>> adjacentEdges = new HashMap<>();
        PriorityQueue<PEdge> priorityQueue;

        for (int i = 0; i < edges.size(); i++) {
            currentEdge = edges.get(i);
            if (!adjacentEdges.containsKey(currentEdge.node1)) {
                adjacentEdges.put(currentEdge.node1, new ArrayList<>());
            }
            if (!adjacentEdges.containsKey(currentEdge.node2)) {
                adjacentEdges.put(currentEdge.node2, new ArrayList<>());
            }
        }

        for (int i = 0; i < edges.size(); i++) {
            currentEdge = edges.get(i);
            currentEdgeList = adjacentEdges.get(currentEdge.node1);
            currentEdgeList.add(new PEdge(currentEdge.weight, currentEdge.node1, currentEdge.node2));
            currentEdgeList = adjacentEdges.get(currentEdge.node2);
            currentEdgeList.add(new PEdge(currentEdge.weight, currentEdge.node2, currentEdge.node1));
        }

        connectedNodes.add(startNode);
        candidateEdgeList = adjacentEdges.getOrDefault(startNode, new ArrayList<>());


        priorityQueue = new PriorityQueue<>();
        for (int i = 0; i < candidateEdgeList.size(); i++) {
            priorityQueue.add(candidateEdgeList.get(i));
        }

        while (!priorityQueue.isEmpty()) {
            poppedEdge = priorityQueue.poll();
            if (!connectedNodes.contains(poppedEdge.node2)) {
                //해당 edge 를 mst 에 추가
                connectedNodes.add(poppedEdge.node2);
                mst.add(new PEdge(poppedEdge.weight, poppedEdge.node1, poppedEdge.node2));

                adjacentEdgesNodes = adjacentEdges.getOrDefault(poppedEdge.node2, new ArrayList<>());
                for (int i = 0; i < adjacentEdgesNodes.size(); i++) {
                    adjacentEdgesNode = adjacentEdgesNodes.get(i);
                    if (!connectedNodes.contains(adjacentEdgesNode.node2)) {
                        priorityQueue.add(adjacentEdgesNode);
                    }
                }
            }
        }
        return mst;
    }




    public static void main(String[] args) {
        최소신장트리프림 T = new 최소신장트리프림();
        ArrayList<PEdge> myedges = new ArrayList<>();
        myedges.add(new PEdge(7, "A", "B"));
        myedges.add(new PEdge(5, "A", "D"));
        myedges.add(new PEdge(8, "B", "C"));
        myedges.add(new PEdge(9, "B", "D"));
        myedges.add(new PEdge(7, "D", "E"));
        myedges.add(new PEdge(5, "C", "E"));
        myedges.add(new PEdge(7, "B", "E"));
        myedges.add(new PEdge(6, "D", "F"));
        myedges.add(new PEdge(8, "E", "F"));
        myedges.add(new PEdge(9, "E", "G"));
        myedges.add(new PEdge(11, "F", "G"));
        System.out.println(T.primFunc("A", myedges));
    }
}
