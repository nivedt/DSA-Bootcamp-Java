package arrays05;

import java.util.Arrays;

public class Three {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        System.out.println(runningSum(nums));
    }
    public static int[] runningSum(int[] nums) {
        int[] array = new int[nums.length];
        array[0] = nums[0];

        for(int i = 1; i < nums.length; i++) {
            array[i] = array[i - 1] + nums[i];
        }
        System.out.println(Arrays.toString(array));
        return array;
    }
}
