import java.util.Arrays;

public class nextPermutation {

    public static void findNextPermutation(int[] nums) {
        int n = nums.length;
        int k = n - 2;
        // null check
        if (nums.length == 0)
            return;
        // find k
        for (int i = n - 1; i > 0; i--) {
            if (nums[i] <= nums[i - 1])
                k--;
            else
                break;
        }
        // if k == -1 then reverse
        if (k == -1) {
            reverse(nums, 0, n - 1);
            return;
        }
        // else replace nums[k] with next greater element and reverse
        for (int i = n - 1; i > 0; i--) {
            if (nums[i] > nums[k]) {
                // swap
                int temp = nums[k];
                nums[k] = nums[i];
                nums[i] = temp;
                break;
            }
        }
        reverse(nums, k + 1, n - 1);

    }

    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{5,1,1};
        findNextPermutation(nums);
        System.out.println(Arrays.toString(nums));
    }
}
