package org.importantMedium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ThreeSumSolution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        // Sorting
        Arrays.sort(nums);

        for (int i = 0; i < nums.length -2; i++) {
            if ( i > 0 && nums[i] == nums[i -1]) continue;

            int left = i+1;
            int right = nums.length -1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    //Skip duplicates for the left pointer
                    while (left < right && nums[left] == nums[left + 1]) left++;
                    //skip duplicates for the right pointer
                    while(left < right && nums[right] == nums[right-1]) right--;

                    //Move both pointers
                    left++;
                    right--;
                } else if (sum < 0) {
                    left ++;
                } else {
                    right--;
                }
            }
        }
        return result;
    }
}
public class ThreeSumMain {
    public static void main(String[] args) {
        ThreeSumSolution threeSumSolution = new ThreeSumSolution();
        int[] nums = {-1,0,1,2,-1,-4};
        List<List<Integer>> triplets = threeSumSolution.threeSum(nums);
        for (List<Integer> triplet: triplets) {
            System.out.println(triplet);
        }
    }
}


// Time Complexity: O(n^2)
// is the optimal time complexity for this problem due to
// the nested loop and the two-pointer technique.
// here’s no way to avoid an O(n²) time complexity in
// the worst case since you are required to examine each
// pair for each element. The brute-force solution would have been O(n³),
// but using sorting + two pointers reduces it to O(n²).
// This is the most optimized
// time complexity for solving the problem in general.

// Space Complexity: O(n)
// or storing the result, where n is the number of triplets.