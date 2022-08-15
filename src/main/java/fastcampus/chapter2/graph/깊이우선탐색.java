package fastcampus.chapter2.graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class 깊이우선탐색 {


    private ArrayList<String> dfsFunc(HashMap<String, ArrayList<String>> graph, String startNode) {
        ArrayList<String> visited = new ArrayList<>();
        ArrayList<String> needVisited = new ArrayList<>();

        needVisited.add(startNode);

        while (needVisited.size() > 0) {
            String node = needVisited.remove(needVisited.size() - 1);
            if (!visited.contains(node)) {
                visited.add(node);
                needVisited.addAll(graph.get(node));
            }
        }
        return visited;
    }

    public static void main(String[] args) {
        깊이우선탐색 T = new 깊이우선탐색();
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        map.put("A", new ArrayList<>(Arrays.asList("B","C")));
        map.put("B", new ArrayList<>(Arrays.asList("A","D")));
        map.put("C", new ArrayList<>(Arrays.asList("A","G","H","I")));
        map.put("D", new ArrayList<>(Arrays.asList("B","E","F")));
        map.put("E", new ArrayList<>(Arrays.asList("D")));
        map.put("F", new ArrayList<>(Arrays.asList("D")));
        map.put("G", new ArrayList<>(Arrays.asList("C")));
        map.put("H", new ArrayList<>(Arrays.asList("C")));
        map.put("I", new ArrayList<>(Arrays.asList("C","J")));
        map.put("J", new ArrayList<>(Arrays.asList("I")));
        System.out.println(map);

        System.out.println(T.dfsFunc(map, "A"));






    }

}
