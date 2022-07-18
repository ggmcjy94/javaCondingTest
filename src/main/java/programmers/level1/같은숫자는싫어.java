package programmers.level1;

import java.util.Stack;

public class 같은숫자는싫어 {

    public int[] solution(int []arr) {
        Stack<Integer> st = new Stack<>();
        st.push(arr[0]);
        for (int i : arr) {
            if (st.peek() != i) {
                st.push(i);
            }
        }
        int[] answer = new int[st.size()];
        for (int i = 0; i < st.size(); i++) {
            answer[i] = st.get(i);
        }
        return answer;
    }
}
