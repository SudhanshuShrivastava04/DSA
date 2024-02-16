public class KadanesAlgo {
    // maxSum of contiguous subarray

    public static int maxSubArray(int[] nums) {
        int currSum = 0;
        int maxSum = nums[0];
        for (int i = 0; i < nums.length; i++) {
            currSum += nums[i];
            maxSum = Math.max(maxSum, currSum);
            if (currSum < 0) {
                currSum = 0;
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{2, -1, 3, -5, 0, 1};
        System.out.println(maxSubArray(nums));
    }
}
