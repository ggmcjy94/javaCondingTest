package test04;

import java.util.HashMap;
import java.util.Scanner;

public class Exam44 {



    public int solution2(String a, String b) {
        int answer = 0;
        HashMap<Character,Integer> am = new HashMap<>();
        HashMap<Character, Integer> bm = new HashMap<>();
        //처음에 b를 담는디.
        for (char x : b.toCharArray()) bm.put(x, bm.getOrDefault(x, 0)+1);
        int L = b.length()-1; // 3 이어서 0, 1 ,2 이기 때문에 -1
        System.out.println(L);
        // a를 담는다.
        for (int i = 0; i < L; i++) am.put(a.charAt(i), am.getOrDefault(a.charAt(i),0) +1);
        // 투포인트 알고리즘 window sliding
        int lt = 0;
        for (int rt = L; rt < a.length(); rt++) {
            // 이제 차례대로 담는다.
            am.put(a.charAt(rt), am.getOrDefault(a.charAt(rt), 0) +1);
            if (am.equals(bm)) answer++; // 객체가 같으면 answer 증가
            am.put(a.charAt(lt), am.get(a.charAt(lt)) - 1); // lt 를 담으면서 1을 빼준다.
            if (am.get(a.charAt(lt)) == 0) am.remove(a.charAt(lt)); // lt 가 0이면 삭제
            lt++;
        }
        return answer;
    }
    public int solution(String a, String b) {
        int answer = 0;
        HashMap<Character, Integer> bm = new HashMap<>();
        HashMap<Character, Integer> am = new HashMap<>();
        for (char x : b.toCharArray()) bm.put(x, bm.getOrDefault(x, 0) +1);
        int L = b.length()-1;
        for (int i = 0; i < L; i++) am.put(a.charAt(i) , am.getOrDefault(a.charAt(i),0) + 1);
        int lt = 0;
        for (int rt=L; rt < a.length(); rt++) {
            am.put(a.charAt(rt),am.getOrDefault(a.charAt(rt),0) + 1);
            if (am.equals(bm)) answer++;
            am.put(a.charAt(lt), am.get(a.charAt(lt)) -1);
            if (am.get(a.charAt(lt)) == 0) am.remove(a.charAt(lt));
            lt++;
        }
        return answer;
    }

    public static void main(String[] args) {
        Exam44 exam21 = new Exam44();
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        System.out.println(exam21.solution2(s, t));
    }
}
