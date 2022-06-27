package leetcode;

public class _10_SearchInsertPosition {

    public int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= target) {
                return i;
            }
        }
        return nums.length;
    }

    public int searchInsert2(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;

        while (start <= end) {
            int mid = start + (end-start)/2;
            if (target == nums[mid]) {
                return mid;
            } else if (target > nums[mid]) {
                start = mid +1;
            } else {
                end = mid -1;
            }
        }
        return start;
    }
}
