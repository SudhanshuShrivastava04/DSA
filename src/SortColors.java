import java.util.Arrays;

public class SortColors {
    // 0 --> red
    // 1 --> white
    // 2 --> blue

    //sorting order --> red white blue
    public static void main(String[] args) {
        int[] nums = new int[]{2,1,0,1,0,2};
        sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static void sortColors(int[] nums) {
        // Dutch Flag Algo
        int mid = 0;
        int low = 0;
        int high = nums.length - 1;
        while (mid <= high) {
            if (nums[mid] == 0) {
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            } else {
                int temp = nums[high];
                nums[high] = nums[mid];
                nums[mid] = temp;
                high--;
            }
        }
    }
}
