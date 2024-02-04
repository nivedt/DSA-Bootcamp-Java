package arrays05;

public class Two {
    public static void main(String[] args) {
        int[] nums = {1,2,1};
        System.out.println(getConcatenation(nums));
    }
    public static int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] array = new int[2*n];

        for (int i = 0; i < n; i++) {
            array[i] = nums[i];
            array[i+n] = nums[i];
        }
        return array;
    }
}
