public class MajorityCount {
    public int majorityElement(int[] nums) {
        int element = 0;
        int count = 0;
        int n = nums.length;
        for (int num : nums) {
            if (count == 0) {
                element = num;
                count = 1;
            } else if (element == num) {
                count++;
            } else count--;
        }
        //check its majCount or not
        int majCount = 0;
        for (int num : nums) {
            if (num == element) majCount++;
        }
        if(majCount > (n/2)) return element;
        return -1;
    }
}
