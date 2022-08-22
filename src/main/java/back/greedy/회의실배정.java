package back.greedy;

import java.util.*;
class Meeting implements Comparable<Meeting>{
    Integer startTime;
    Integer endTime;
    public Meeting(Integer startTime, Integer endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }
    @Override
    public int compareTo(Meeting o) {
        if (this.endTime == o.endTime) {
            return this.startTime - o.startTime;
        }
        return this.endTime - o.endTime;
    }
}

public class 회의실배정 {
    private int solution (ArrayList<Meeting> dataList) {
        Collections.sort(dataList);
        int answer = 0;
        int e = 0;
        for (Meeting meeting : dataList) {
            if (e <= meeting.startTime) {
                e = meeting.endTime;
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<Meeting> dataList = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            dataList.add(new Meeting(sc.nextInt(), sc.nextInt()));
        }
        회의실배정 T = new 회의실배정();
        System.out.println(T.solution(dataList));
    }
}
