package leetcode;

import java.util.Stack;

public class _05_ValidParentheses {

    public boolean isValid(String s) { //s = "()[]{}"
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            char item;
            if (c == '(' || c== '{' || c =='[') {
                stack.push(c);
            } else {
                try {
                    item = stack.pop();
                } catch (Exception e) {
                    return false;
                }
                if ((c == ')' && item != '(') || (c == ']' && item != '[') || (c == '}' && item != '{')) return false;
            }
        }
        return stack.isEmpty();
    }

    public boolean isValid2(String s) {
        Stack<Character> st = new Stack<>();
        char[] arr = s.toCharArray();
        for (char c : arr) {
            if (c == '(' || c == '{' || c == '[') {
                st.push(c);
            } else if (c == ')') {
                if (st.size() == 0 || st.pop()!='('){
                    return false;
                }
            }else if (c == '}') {
                if (st.size() == 0 || st.pop() != '{') {
                    return false;
                }
            }else if (c == ']') {
                if (st.size() == 0 || st.pop() != '[') {
                    return false;
                }
            } else {
                return false;
            }
        }
        return st.size() == 0;
    }
}
