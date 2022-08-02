package programmers.level2;

public class 조이스틱 {

    public int solution(String name) {
        int answer = 0;
        int len = name.length();

        int min = len - 1;

        for (int i = 0; i < len; i++) {
            char c = name.charAt(i);
            int mov = (c - 'A' < 'Z' - c + 1) ? (c - 'A') : ('Z' - c + 1);
            answer += mov;

            // 조이스틱 좌우 이동
            int nextIndex = i + 1;

            //다음 단어가 A이고 단어가 끝나기 전까지 nextIndex 증가
            while (nextIndex < len && name.charAt(nextIndex) == 'A') {
                nextIndex++;
            }
            //ì * 2 는 중간까지 왔다가 다시 뒤로 돌아갈 때의 조이스틱 이동 횟수이고, len - nextIndex 는 예시의 오른쪽에서 두번째의 B같은 애들까지의 위치이다.
            min = Math.min(min, (i * 2) + len - nextIndex);
        }
        answer += min;
        return answer;
    }

    public static void main(String[] args) {
        조이스틱 T = new 조이스틱();
        System.out.println(T.solution("JEROEN"));
    }
}
