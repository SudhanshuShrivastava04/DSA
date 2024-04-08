public class MaxSumSubarrayOfSizeK {
    public static int maxSumSubarray(int[] arr, int k) {
        int maxSum = Integer.MIN_VALUE; // Initialize maxSum with minimum value to handle negative sums
        int windowSum = 0; // Initialize the sum of the current window

        // Initialize the left and right pointers for the sliding window
        int left = 0;
        int right = 0;

        // Slide the window along the array
        while (right < arr.length) {
            // Expand the window by adding the element at the right pointer
            windowSum += arr[right];

            // Shrink the window if it exceeds size k
            if (right - left + 1 > k) {
                windowSum -= arr[left]; // Remove the element at the left pointer
                left++; // Move the left pointer to the right
            }

            // Update maxSum if the current window sum is greater
            if (right - left + 1 == k) {
                maxSum = Math.max(maxSum, windowSum);
            }

            // Move the right pointer to the right
            right++;
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 1, 3, -1, 6, -2, 0};
        int k = 3;

        System.out.println(maxSumSubarray(array, k)); // Output: 8 (sum of subarray [1, 3, -1])
    }
}
