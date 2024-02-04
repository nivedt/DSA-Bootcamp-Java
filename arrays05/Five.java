package arrays05;

import java.util.Arrays;

public class Five {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2};
        System.out.println(Arrays.toString(shuffle(arr, 2)));
    }
    static int[] shuffle(int[] nums, int n) {
        int[] result = new int[2 * n];

        for (int i = 0, j = 0; i < n; i++) {
            result[j++] = nums[i];
            result[j++] = nums[i + n];
        }
        return result;
    }

    // Previously Tried
//    static int[] shuffle(int[] nums, int n) {
//        int[] result = new int[2 * n];
//        for (int i = 0; i < 2 * n; i++) {
//            if (i % 2 == 0) {
//                result[i] = nums[i / 2];
//            } else {
//                result[i] = nums[n + i / 2];
//            }
//        }
//        return result;
//    }
}
