package arrays05;

import java.util.Arrays;

public class One {
    public static void main(String[] args) {
        int[] nums = {0,2,1,5,3,4};
        System.out.println(buildArray(nums));
    }
    public static int[] buildArray(int[] nums) {
        // Scanner input = new Scanner(System.in);
        int n = nums.length;
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = nums[nums[i]];
            System.out.println(i);
            System.out.println(Arrays.toString(array));
        }
        return array;
    }
}
