// Leetcode: 918. MAXIMUM SUM CIRCULAR SUBARRAY

class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int maxSum = nums[0];
        int minSum = nums[0];
        int currMaxSum = nums[0];
        int currMinSum = nums[0];
        int totalSum = nums[0];
        
        for (int i = 1; i < nums.length; i++) {
            // Kadane's algorithm for maximum sum
            currMaxSum = Math.max(currMaxSum + nums[i], nums[i]);
            maxSum = Math.max(maxSum, currMaxSum);
            
            // Kadane's algorithm for minimum sum
            currMinSum = Math.min(currMinSum + nums[i], nums[i]);
            minSum = Math.min(minSum, currMinSum);
            
            totalSum += nums[i];
        }
        
        int circularSum = totalSum - minSum;
        
        if (circularSum == 0) {
            return maxSum;
        }
        return Math.max(maxSum, circularSum);
    }
}
