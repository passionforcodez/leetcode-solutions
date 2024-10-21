package org.subarray;

// Arr = {1,5,3,1,6,8}  k = {1}
// we have to find the total number of subArrays whose
// sum equals k.

// so here we have k = 1
// we get  total = 2 since 2 1's.
// using Hash Map to store the prefix sum.

import java.util.HashMap;

class SubArraySumSolution {
    public int subArraySum (int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        // Initialize with sum 0 having one occurrence
        // (important for the case when the sum exactly
        // equals k at an index)
        map.put(0,1);
        int count = 0;
        int currentSum = 0;

        for (int num: nums) {
            currentSum += num;
            if(map.containsKey(currentSum - k)) {
                // We check if the difference currentSum - k exists in the map.
                count += map.get(currentSum - k);
            }
            map.put(currentSum, map.getOrDefault(currentSum,0)+ 1);
        }
        return count;
    }
}
public class SubArraySumEqualKMain {
    public static void main (String[] args){
        SubArraySumSolution subArraySumSolution = new SubArraySumSolution();
        int[] nums = {1,2,3,6};
        int k = 3;
        System.out.println("Total number of SubArrays found: "+ subArraySumSolution.subArraySum(nums,k));
    }
}

// TC - O(n)
// SC - O(n)