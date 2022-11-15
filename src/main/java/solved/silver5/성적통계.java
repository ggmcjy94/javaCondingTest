package solved.silver5;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class 성적통계 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            System.out.println("Class " + i);
            int K = sc.nextInt();
            Integer[] nums = new Integer[K];
            int gap = Integer.MIN_VALUE;
            for (int j = 0; j < K; j++) {
                int num = sc.nextInt();
                nums[j] = num;
            }
            Arrays.sort(nums, Collections.reverseOrder());
            for (int j = 0; j < nums.length - 1; j++) {
                gap = Math.max(nums[j] - nums[j + 1],gap);
            }
            System.out.print("Max " + nums[0] +", Min " + nums[nums.length-1] + ", Largest gap " + gap);
            System.out.println();
        }
    }
}
