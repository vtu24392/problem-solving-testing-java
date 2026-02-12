// Leetcode : 53. MAXIMUM SUBARRAY

class Solution {
    public int maxSubArray(int[] nums) {
        int currVal = 0;
        int maxVal = Integer.MIN_VALUE;

        for(int num : nums) {
            currVal += num;
            maxVal = Math.max(currVal, maxVal);

            if(currVal < 0 ) {
                currVal = 0;
            }
        }

        return maxVal;
    }
}
