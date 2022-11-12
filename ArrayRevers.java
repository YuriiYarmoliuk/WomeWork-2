package HW2;

import java.util.Collections;
import java.util.Arrays;

public class ArrayRevers {
        public static void main(String[] args) {
            Integer[] nums = {2, 3, 1, 7, 11};
            Arrays.sort(nums, Collections.reverseOrder());

            for (int values : nums) {
                System.out.print(values + " ");
            }
        }
    }
