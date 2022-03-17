package test04;

import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;

public class Exam42 {
    private HashMap<Character, Integer> putHashMap(String a) {
        HashMap<Character , Integer> map = new HashMap<>();
        for (char c : a.toCharArray()) {
            map.put(c, map.getOrDefault(c , 0) + 1);
        }
        return map;
    }

    public String solution(String a, String s) {
        String answer = "YES";
        HashMap<Character, Integer> map = putHashMap(a);
        HashMap<Character, Integer> map2 = putHashMap(s);
        for (Character c : map2.keySet()) {
            if (!map.containsKey(c)||!Objects.equals(map.get(c), map2.get(c))) {
                answer = "NO";
            }
        }
        return answer;
    }

    public String solution2(String a, String s) {
        String answer = "YES";
        HashMap<Character, Integer> map = putHashMap(a);
        for (char x : s.toCharArray()) {
            if (!map.containsKey(x) || map.get(x) == 0) return "NO";
            map.put(x, map.get(x)-1);
        }

        return answer;
    }



    public static void main(String[] args) {
        Exam42 exam21 = new Exam42();
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String s = sc.next();
        System.out.println(exam21.solution(a,s));
    }
}
