package programmers;

import java.util.Arrays;
import java.util.HashSet;


public class 폰켓몬 {

    public int solution(int[] nums) {
        int max = nums.length / 2;
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        if (set.size() > max) {
            return max;
        } else {
            return set.size();
        }
    }

    public static void main(String[] args) {
        폰켓몬 T = new 폰켓몬();
        System.out.println(T.solution(new int[] {3,1,2,3}));
    }
}
