package leetcode;

public class _461_HammingDistance {

    public int hammingDistance(int x, int y) {
        /**
         *  a = 3 -> 11
         *  b = 2 -> 10
         *
         *  a & b = 10 : 두비트가 모두 1이면 1, 아니면 0
         *  a | b = 11 : 두비트중 하나라도 1이면 1, 아니면 0
         *  a ^ b = 01 : 두비트가 다르면 1, 아니면 0
         *
         *  a >> 1 = 01 : a의 모든 비트를 오른쪽으로 i 만큼 밀고, 맨왼쪽을 0으로 채움
         *  a << 1 = 10 : a의 모든 비트를 왼쪽으로 i 만큼 밀고, 맨오른쪽을 0으로 채움
         */
        int xor = x ^ y;
        int cnt = 0;
        for (int i = 0; i < 32; i++) { // Integer 는 4 바이트  --> 32 비트
            cnt += (xor >> i) & 1;
        }
        return cnt;
    }

    public static void main(String[] args) {

    }
}
