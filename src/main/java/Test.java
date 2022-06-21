import java.util.HashMap;

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
        System.out.println(t.romanToInt("MCMXCIV"));
    }


    public int romanToInt(String s) {
        int output = 0;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
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
}
