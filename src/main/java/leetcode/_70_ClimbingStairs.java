package leetcode;

/**
 * dp
 */
public class _70_ClimbingStairs {
    // 1 2 3 5 8 : 피보나치 수열
    // f(n) = f(n-1) + f(n-2)
    // f(5) = f(4) + f(3)
    // f(4) = f(3) + f(2)
    // 그냥 재귀구현을 하면 : 공간 복잡도가 o(1) 시간복잡도 o(2^n)
    // f(2) = 2
    // f(3) = 3
    // dp => 공간복잡도 O(n) 시간복잡도 O(n)
    // 정화식을 찾아야한다.
    public int climbStairs(int n) {
        if (n <= 0) return 0;
        if (n <= 1) return 1;
        int[] dy = new int[n+1];
        dy[1] = 1;
        dy[2] = 2;
        for (int i = 3; i <= n; i++) {
            dy[i] = dy[i-2] + dy[i-1];
        }
        return dy[n];
    }

    public int climbStairs2(int n) {
        if (n == 1) return 1;
        else if (n == 2) return 1;
        else return climbStairs2(n - 2) + climbStairs2(n - 1);
    }


}
