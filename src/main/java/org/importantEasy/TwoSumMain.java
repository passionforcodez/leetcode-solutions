package org.importantEasy;

import java.util.Arrays;
import java.util.HashMap;

// nums = [2,7,11,15]
// target = 9
class TwoSumSolution {
    int[] nums = {2,5,7,8};
    int target = 9;
    public int[] twoSum () {
        int [] result = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            // x + y = target
            // y = target - x
            int y  = target - nums[i];
            if (map.containsKey(y)) {
                result[0] = map.get(y);
                result[1] = i;
            }
            map.put(nums[i], i);
        }
        return result;
    }
}

public class TwoSumMain {
    public static void main (String[] args) {
        TwoSumSolution twoSumSolution = new TwoSumSolution();
        System.out.println("TwoSum:" + Arrays.toString(twoSumSolution.twoSum()));
    }
}

// TC - O(n)
// SC - O(n)

