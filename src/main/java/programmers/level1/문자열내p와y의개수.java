package programmers.level1;


public class 문자열내p와y의개수 {

    boolean solution(String s) {
        boolean answer = false;
        int pCnt = 0;
        int yCnt = 0;
        for (char c : s.toCharArray()) {
            if (c == 'p' || c=='P') {
                pCnt++;
            } else if (c == 'y' || c == 'Y') {
                yCnt++;
            }
        }

        if (pCnt == yCnt) return true;
        return answer;
    }

}
