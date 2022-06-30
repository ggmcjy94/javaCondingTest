package programmers;

import java.util.HashMap;

public class 숫자문자열과영단어 {

    public int solution(String s) {
        HashMap<Integer , String> map = new HashMap<>();
        map.put(0,"zero");
        map.put(1,"one");
        map.put(2,"two");
        map.put(3,"three");
        map.put(4,"four");
        map.put(5,"five");
        map.put(6,"six");
        map.put(7,"seven");
        map.put(8,"eight");
        map.put(9,"nine");
        for (int i = 0; i < map.size(); i++) {
            if (s.contains(map.get(i))) {
                s = s.replace(map.get(i), String.valueOf(i));
            }
        }
        return Integer.parseInt(s);
    }

    public static void main(String[] args) {
        숫자문자열과영단어 T = new 숫자문자열과영단어();
        System.out.println(T.solution("one4seveneight"));
    }
}
