package programmers.level3;

public class 가장긴팰린드롬 {
    public int solution(String s)
    {
        //abacde
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < s.length(); i++) {
            int start = i;
            int end = s.length() - 1;
            int cur = 0;
            int x = 1;
            while (start < end) {
                if (s.charAt(start) == s.charAt(end)) {
                    start++; //1
                    end--; //1
                    cur += 2;
                } else {
                    cur = 0;
                    start = i;
                    end = s.length() - 1 - x; // 4 3
                    x++; // 2
                }
            }

            if (start == end) {  // 중간 숫자 count;
                cur++;
            }

            max = Math.max(max, cur);
        }
        return max;
    }
}
