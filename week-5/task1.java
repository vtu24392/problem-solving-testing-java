// Leetcode : 53. MAXIMUM SUBARRAY

class Solution {
    public int maxSubArray(int[] nums) {
    int currentSum = nums[0];
    int maxSum = nums[0]; 

    //Kadane's algorithm

    for (int i = 1; i < nums.length; i++) {
        currentSum = Math.max(nums[i], currentSum + nums[i]);

        maxSum = Math.max(maxSum, currentSum);
    }

    return maxSum;
    }
}
