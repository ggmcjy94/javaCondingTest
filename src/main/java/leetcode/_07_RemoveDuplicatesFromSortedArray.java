package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class _07_RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int index  = 1;
        for (int i = 0; i < nums.length - 1 ; i++) {
            if (nums[i] != nums[i + 1]) {
                nums[index++] = nums[i+1];
            }
        }
        for (int num : nums) {
            System.out.print(num + " ");
        };
        return index;
    }
}
