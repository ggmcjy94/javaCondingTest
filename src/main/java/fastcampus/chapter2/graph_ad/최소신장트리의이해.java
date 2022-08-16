package fastcampus.chapter2.graph_ad;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

/**
 * 크루스칼 알고리즘
 * 탐욕 알고리즘을 기초로 하고 있음
 *
 */

class KEdge implements Comparable<KEdge>{
    int weight;
    String nodeV;
    String nodeU;

    public KEdge(int weight, String nodeV, String nodeU) {
        this.weight = weight;
        this.nodeV = nodeV;
        this.nodeU = nodeU;
    }

    @Override
    public String toString() {
        return "(" + this.weight +"," + this.nodeV +"," + this.nodeU + ")";
    }

    @Override
    public int compareTo(KEdge o) {
        return this.weight - o.weight;
    }
}

public class 최소신장트리의이해 {
    //Union & Find 일고리즘
    HashMap<String, String> parent = new HashMap<>();
    HashMap<String, Integer> rank = new HashMap<>();


    private void union(String nodeV, String nodeU) {
        String root1 = this.find(nodeV);
        String root2 = this.find(nodeU);

        // union by rank 기법
        if (rank.get(root1) > rank.get(root2)) {
            parent.put(root2 , root1);
        } else {
            parent.put(root1, root2);
            if (rank.get(root1) == rank.get(root2)) {
                rank.put(root2 , rank.get(root2) + 1);
            }
        }
    }
    private String find (String node) {
        //path compression 기법
        if (parent.get(node) != node) {
            parent.put(node, find(parent.get(node)));
        }
        return parent.get(node);
    }

    private void makeSet(String node) {
        parent.put(node, node);
        rank.put(node, 0);
    }

    private ArrayList<KEdge> kruskalFunc(ArrayList<String> vetices, ArrayList<KEdge> edges) {
        ArrayList<KEdge> mst = new ArrayList<>();
        KEdge currentEdge;

        //1. 초기화
        for (int i = 0; i < vetices.size(); i++) {
            this.makeSet(vetices.get(i));
        }

        //2. 간선 weight 기반 , sorting
        Collections.sort(edges);

        for (int i = 0; i < edges.size(); i++) {
            currentEdge = edges.get(i);
            if (this.find(currentEdge.nodeV) != this.find(currentEdge.nodeU)) {
                this.union(currentEdge.nodeV, currentEdge.nodeU);
                mst.add(currentEdge);
            }
        }
        return mst;
    }


    public static void main(String[] args) {
        최소신장트리의이해 T = new 최소신장트리의이해();
        ArrayList<String> vetices = new ArrayList<>(Arrays.asList("A","B","C","D","E","F","G"));
        ArrayList<KEdge> edges = new ArrayList<>();
        edges.add(new KEdge(7, "A", "B"));
        edges.add(new KEdge(5, "A", "D"));
        edges.add(new KEdge(7, "B", "A"));
        edges.add(new KEdge(8, "B", "C"));
        edges.add(new KEdge(9, "B", "D"));
        edges.add(new KEdge(7, "B", "E"));
        edges.add(new KEdge(8, "C", "B"));
        edges.add(new KEdge(5, "C", "E"));
        edges.add(new KEdge(5, "D", "A"));
        edges.add(new KEdge(9, "D", "B"));
        edges.add(new KEdge(7, "D", "E"));
        edges.add(new KEdge(6, "D", "F"));
        edges.add(new KEdge(7, "E", "B"));
        edges.add(new KEdge(5, "E", "C"));
        edges.add(new KEdge(7, "E", "D"));
        edges.add(new KEdge(8, "E", "F"));
        edges.add(new KEdge(9, "E", "G"));
        edges.add(new KEdge(6, "F", "D"));
        edges.add(new KEdge(8, "F", "E"));
        edges.add(new KEdge(11, "F", "G"));
        edges.add(new KEdge(9, "G", "E"));
        edges.add(new KEdge(11, "G", "F"));

        System.out.println(T.kruskalFunc(vetices, edges));
    }

}
