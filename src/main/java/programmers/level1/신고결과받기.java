package programmers.level1;

import java.util.*;
import java.util.stream.Collectors;

//class Declaration {
//    String reporter;
//    String beReporter;
//
//    public Declaration(String reporter, String beReporter) {
//        this.reporter = reporter;
//        this.beReporter = beReporter;
//    }
//}

public class 신고결과받기 {

    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer =new int[id_list.length];
        HashMap<String, HashSet<String>> map = new HashMap<>();
        HashMap<String, Integer> idxMap = new HashMap<>();

        for (int i = 0; i < id_list.length; i++) {
            String name = id_list[i];
            map.put(name, new HashSet<>());
            idxMap.put(name, i);
        }

        for (String s : report) {
            String[] str = s.split(" ");
            String from = str[0];
            String to = str[1];
            map.get(to).add(from);
        }
        for (int i = 0; i < id_list.length; i++) {
            HashSet<String> send = map.get(id_list[i]);
            if (send.size() >= k) {
                for (String name : send) {
                    answer[idxMap.get(name)]++;
                }
            }
        }
        return answer;
    }

    public int[] solution2(String[] id_list, String[] report, int k) { //스트림
        List<String> list = Arrays.stream(report).distinct().collect(Collectors.toList());
        HashMap<String, Integer> count = new HashMap<>();
        for (String s : list) {
            String target = s.split(" ")[1];
            count.put(target, count.getOrDefault(target,0) + 1);
        }
        return Arrays.stream(id_list).map(_user -> {
            final String user = _user;
            List<String> reportList = list.stream().filter(s -> s.startsWith(user + " ")).collect(Collectors.toList());
            return reportList.stream().filter(s -> count.getOrDefault(s.split(" ")[1], 0) >= k).count();
        }).mapToInt(Long::intValue).toArray();
    }

    public static void main(String[] args) {
        신고결과받기 T = new 신고결과받기();
        String[] id_list = new String[] {"muzi", "frodo", "apeach", "neo"};
        String[] report = new String[] {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
        int k = 2;
        for (int s : T.solution2(id_list,report,k)) {
            System.out.print(s + " ");
        }
    }
}
