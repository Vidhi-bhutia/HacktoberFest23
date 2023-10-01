public class maximumSubArraySum {

    /**
     * Finds the maximum subarray sum in a given array of integers.
     *
     * @param nums An array of integers.
     * @return The maximum subarray sum.
     */
    public static int findMaximumSubArraySum(int[] nums) {
        int maxSum = nums[0];
        int currentSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int result = findMaximumSubArraySum(arr);
        System.out.println("Maximum Subarray Sum: " + result);
    }
}
