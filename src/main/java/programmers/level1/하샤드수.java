package programmers.level1;

public class 하샤드수 {
    public boolean solution(int x) {
        boolean answer = true;
        int sum = 0;
        for (char c : String.valueOf(x).toCharArray()) {
            sum += Integer.parseInt(String.valueOf(c));
        }
        if (x % sum != 0) return false;
        return answer;
    }
}
