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
        System.out.println(t.isPallindrome(11));
    }
}
