package fastcampus.chapter3.sort_application;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class 국영수 {

    static class Subject implements Comparable<Subject>{

        String name;
        Integer korean;
        Integer English;
        Integer Math;

        public Subject(String name, Integer korean, Integer english, Integer math) {
            this.name = name;
            this.korean = korean;
            English = english;
            Math = math;
        }

        @Override
        public int compareTo(Subject o) {
//            if (this.korean == o.korean && this.English == o.English && this.Math == o.Math) {
//                return this.name.compareTo(o.name);
//            } else if (this.korean == o.korean && this.English == o.English) {
//                return o.Math - this.Math;
//            } else if (this.korean == o.korean) {
//                return this.English - o.English;
//            } else {
//                return o.korean - this.korean;
//            }

            //국어 점수 내림차수
            if (this.korean != o.korean) return o.korean - this.korean;
            //영어 점수 오름차순
            if (this.English != o.English) return this.English - o.English;
            // 수학 점수 내림차순
            if (this.Math != o.Math) return o.Math - this.Math;
            return this.name.compareTo(o.name);
        }
    }

    private static String[] solution(ArrayList<Subject> subjects) {
        Collections.sort(subjects);
        String[] answer = new String[subjects.size()];
        for (int i = 0; i < subjects.size(); i++) {
            answer[i] = subjects.get(i).name;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer N = sc.nextInt();
        ArrayList<Subject> subjects = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            subjects.add(new Subject(sc.next(),sc.nextInt(), sc.nextInt(), sc.nextInt()));
        }
        for (String name : solution(subjects)) {
            System.out.println(name);
        }
    }
}
