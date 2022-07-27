package programmers.level1;

public class 자연수뒤집어배열로만들기 {
    public int[] solution(long n) {
        String value = String.valueOf(n);
        int[] answer = new int[value.length()];
        int cnt=0;
        for (int i = value.length()-1; i >= 0; i--) {
            answer[cnt++] = Integer.parseInt(String.valueOf(value.charAt(i)));
        }
        return answer;
    }

}
