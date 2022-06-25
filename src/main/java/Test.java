import java.util.EmptyStackException;
import java.util.HashMap;
import java.util.Stack;

public class Test {

    public boolean isPallindrome(int x) {

        if (x < 0) return false;

        int reverse = 0;
        int temp = x; // 11
        while (temp != 0) {
            reverse = reverse*10 + temp % 10;
            temp /= 10;
            System.out.println(temp);
        }
        return  reverse == x;
    }

    public static void main(String[] args) {
        Test t = new Test();
        String s[] = {"flower", "flow", "flight"};
        System.out.println(t.longestCommonPrefix(s));
    }

    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++)
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        return prefix;
    }


    public int romanToInt(String s) {
        int output = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        output = map.get(s.charAt(s.length() -1)); // 맨 마지막 값 변수 지정
        for(int i = s.length() - 2; i >= 0; i--) { //MCMXCIV
            if(map.get(s.charAt(i)) >= map.get(s.charAt(i + 1)))
                output += map.get(s.charAt(i));
            else
                output -= map.get(s.charAt(i));
        }
        return output;
    }

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            char item;
            if (c == '(' || c=='{' || c=='[') {
                stack.push(c);
            } else {
                try {
                    item = stack.pop();
                } catch (Exception e) {
                    return false;
                }
                if ((c == ')' && item != '(') || (c == '}' && item != '{') || (c == ']' && item != '[')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
