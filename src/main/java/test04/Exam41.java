package test04;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Exam41 {

    public char solution(int n, String s) {
        char answer = 0;
        HashMap<Character , Integer> map = new HashMap<>();
        for (char x : s.toCharArray()) {
            map.put(x , map.getOrDefault(x, 0) + 1);  //getOrDefault x 가 없으면 디폴트 로 0;
        }

        System.out.println(map.containsKey('A')); // 있는지 확인
        System.out.println(map.size()); // 키의 갯수
        System.out.println(map.remove('C')); // 5 print
        System.out.println(map.size());

        int max = Integer.MIN_VALUE;
        for (char k : map.keySet()) {
            if (map.get(k) > max) {
                max = map.get(k);
                answer = k;
            }
        }
        return answer;
    }

    public char solution2(int n, String s) {
        char answer = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (char aChar : s.toCharArray()) {
            map.put(aChar, map.getOrDefault(aChar, 0) + 1);
        }
        int max = Integer.MIN_VALUE;
        for (Character key : map.keySet()) {
            if (map.get(key) > max) {
                max = map.get(key);
                answer = key;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Exam41 exam21 = new Exam41();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        System.out.println(exam21.solution(n,s));
    }
}
