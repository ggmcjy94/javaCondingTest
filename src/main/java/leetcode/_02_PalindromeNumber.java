package leetcode;

import java.util.Scanner;

public class _02_PalindromeNumber {

    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        int temp = x;
        int reverse = 0;
        while (temp != 0) {
            reverse = reverse*10 + temp%10;
            temp /= 10;
        }
        if (reverse == x) return true;
        else {
            return false;
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        _02_PalindromeNumber T = new _02_PalindromeNumber();
        System.out.println(T.isPalindrome(sc.nextInt()));
    }
}
