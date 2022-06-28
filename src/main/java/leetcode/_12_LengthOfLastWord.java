package leetcode;

public class _12_LengthOfLastWord {

    public int lengthOfLastWord(String s) {
        //hello world
        int cnt = 0;
        boolean hasChar = false;

        for (int i = s.length() -1; i >= 0; i--) {
            if (s.charAt(i)!=' ') {
                hasChar = true;
                cnt++;
            } else {
                if (hasChar) {
                    return cnt;
                }
            }
        }
        return cnt;
    }
}
