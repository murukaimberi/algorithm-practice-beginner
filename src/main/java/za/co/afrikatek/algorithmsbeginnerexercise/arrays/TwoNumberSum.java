package za.co.afrikatek.algorithmsbeginnerexercise.arrays;

import java.util.Arrays;

public class TwoNumberSum {
    public static void main(String[] args) {
//        int[] nums = new int[]{-2, 2, 11, 15, -3};
//        int k = 8;

        int[] nums = new int[]{5, 12, 15, 21, 6, 17};
        int k = 33;

        System.out.println(Arrays.toString(sumOfTwoNumbers(nums, k)));
    }

    public static int[] sumOfTwoNumbers(int[] nums, int k) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            // Fetch the value pointed to by p1
            int value = nums[i];
            int difference = k - value;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == difference) {
                    // found the solution
                    result[0] = difference;
                    result[1] = value;
                }
            }
        }
        return result;
    }
}
