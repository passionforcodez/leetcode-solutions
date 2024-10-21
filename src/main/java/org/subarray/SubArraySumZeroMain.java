package org.subarray;

import java.util.*;

class SubArraySumZeroSolution {
    public List<List<Integer>> findSubArrayWithZero(int[] nums) {
        // List to store the result (all subarrays with sum zero)
        List<List<Integer>> result = new ArrayList<>();
        // HashMap to store the frequency of cumulative sums
        Map<Integer, List<Integer>> map = new HashMap<>();

        // Initialize with the sum 0, which indicates subArrays starting from index 0
        // This handles case when subArray sum from start is 0
        map.put(0, new ArrayList<>(Arrays.asList(-1)));

        int currentSum = 0;

        // Traverse through the array
        for (int i = 0; i < nums.length; i++) {
            // Update current cumulative sum
            currentSum += nums[i];
            // If currentSum is found in the map, that means a subarray with sum zero exists
            if (map.containsKey(currentSum)) {
                // Get all previous indices where the cumulative sum was the same
                for (int start: map.get(currentSum)) {
                    // Create the subarray from start+1 to the current index i
                    List<Integer> subarray = new ArrayList<>();
                    for (int j = start + 1; j <= i; j++) {
                        subarray.add(nums[j]);
                    }
                    // Add the subarray to result
                    result.add(subarray);
                }
            }
            // Add the current index to the map for this cumulative sum
            map.putIfAbsent(currentSum, new ArrayList<>());
            map.get(currentSum).add(i);
        }
        return result;
    }
}

public class SubArraySumZeroMain {
    public static void main(String[] args) {
        SubArraySumZeroSolution subArraySumZeroSolution = new SubArraySumZeroSolution();
        int[] nums = {1, -1, 3, -3, 4, -4, 0};
        System.out.println("Subarrays whose sum is Zero: "+ subArraySumZeroSolution.findSubArrayWithZero(nums));
    }
}

// TC - O(n)
// SC - O(n)