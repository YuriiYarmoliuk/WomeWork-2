package HW2;

import java.util.Arrays;

public class ReplaceDuplicated {

    public static void main(String[] args) {

        int[] nums = {3, 2, 3, 1, 4, 2, 8, 3};
        for (int i : nums) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    nums[j] = 0;
                }
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}