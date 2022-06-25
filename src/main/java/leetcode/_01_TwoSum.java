package leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class _01_TwoSum {

    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; i++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        _01_TwoSum T = new _01_TwoSum();
        int[] nums = new int[]{2, 7, 11, 15};
        int target = kb.nextInt();
        System.out.println(Arrays.toString(T.twoSum(nums, target)));
    }
}
