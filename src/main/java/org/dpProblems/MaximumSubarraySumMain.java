package org.dpProblems;

class MaximumSubArraySumSolution {
    public int MaxSubArray(int[] nums) {
        int currentSum = nums[0];
        int maxSum = nums[0];

        for (int i = 1; i < nums.length; i++ ){
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }
}
public class MaximumSubarraySumMain {
    public static void main(String[] args){
        MaximumSubArraySumSolution maximumSubArraySumSolution = new MaximumSubArraySumSolution();
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println("Maximum Subarray Sum: " + maximumSubArraySumSolution.MaxSubArray(nums));
    }
}

// Time complexity : O(n)
// Space Complexity: O(1)