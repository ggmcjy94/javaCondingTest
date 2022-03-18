package test04;

import java.util.*;

public class Exam43 {

    public ArrayList<Integer> solution(int n, int k, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        HashMap<Integer, Integer> HM = new HashMap<>();
        for (int i = 0; i < k-1; i++) { // lt 를 3개 담고
            HM.put(arr[i], HM.getOrDefault(arr[i], 0) + 1);
        }

        int lt = 0;
        for (int rt=k-1; rt < n; rt++) {
            HM.put(arr[rt], HM.getOrDefault(arr[rt], 0) + 1); //rt 한개담고
            //슬라이딩 시작
            answer.add(HM.size()); // 3 4 4 3
            HM.put(arr[lt], HM.get(arr[lt])-1);
            if (HM.get(arr[lt]) == 0) {
                HM.remove(arr[lt]);
            }
            lt++;
        }
        return answer;
    }

    public static void main(String[] args) {
        Exam43 exam21 = new Exam43();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i : exam21.solution(n, k , arr)) {
            System.out.print(i + " ");
        }
    }
}
