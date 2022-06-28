package leetcode;

public class _11_MaximumSubarray {

    public int maxSubArray(int[] nums) {
        int len = nums.length;
        int max = nums[0];

        for (int i = 0; i < len; i++) {
            int localMax = nums[i];
            int sum = 0;
            for (int j = i; j < len; j++) {
                sum += nums[j];
                localMax = Math.max(localMax, sum);
            }
            max = Math.max(max, localMax);
        }
        return max;
    }

    public int maxSubArray2(int[] nums) { // -2 1 -3 4 -1 2 1 -5 4
        int len = nums.length;
        int max = nums[0];
        int localMax = nums[0];
        for (int i = 1; i < len; i++) {
            localMax = Math.max(localMax+nums[i], nums[i]);// 1 -2 4 3 5 6 1 5 
            System.out.println(" localMax:  "+localMax +" ");
            max = Math.max(localMax, max); // 7
            System.out.println(" max:  "+max +" ");

        }
        return max;
    }
}
