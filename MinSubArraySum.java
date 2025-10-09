public class MinSubArraySum {
    public static int minSubArray(int[] nums) {
        int currentSum = nums[0];
        int minSum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.min(nums[i], currentSum + nums[i]);
            minSum = Math.min(minSum, currentSum);
        }
        return minSum;
    }

    public static void main(String[] args) {
        int[] nums = {2, -1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("Minimum subarray sum is: " + minSubArray(nums));
    }
    
}
