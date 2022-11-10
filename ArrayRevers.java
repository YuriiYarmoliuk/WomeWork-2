package HW2;

import java.util.Arrays;

public class ArrayRevers {

    public static void main(String[] args) {

        int[] nums = {2, 3, 1, 7, 11};
        sortAndPrint(nums);
    }
    public static void sortAndPrint(int[] m) {

        Arrays.sort(m);
        for (int i = m.length - 1; i >= 0; i--)
            System.out.print(m[i] + " ");
        System.out.println("");
    }
}
