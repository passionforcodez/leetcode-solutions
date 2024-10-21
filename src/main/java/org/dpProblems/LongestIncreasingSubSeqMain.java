package org.dpProblems;

// This problem can be solved using recursion, but TC
// will be 2^n.
// It can solve by Dp alone but the TC will be n^2
// To optimize it best approach is BS(Binary Search)
// TC will be nlogn

import java.util.Arrays;

class LongestIncSeqSolution {
    public int lengthOfLIS(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }
        // lis[] stores the smallest possible end value
        // for increasing subsequence of different lengths
        int[] lis = new int[arr.length];
        int length = 0;

        for (int num: arr) {
            // Using BS to find the index where num can replace
            // an element in lis[]
            int idx = Arrays.binarySearch(lis, 0, length, num);

            // if idx is negative, it means num should replace the element at index (-idx-1)
            if(idx < 0) {
                idx = -idx -1;
            }
            // Update the lis[]
            lis[idx] = num;

            //if num was placed at the end, increase the length of lis[]
            if (idx == length) {
                length++;
            }
        }
        return length;
    }
}
public class LongestIncreasingSubSeqMain {
    public static void main (String[] args){
        LongestIncSeqSolution longestIncSeqSolution = new LongestIncSeqSolution();
        int[] arr = {10,9,2,5,3,7,101,18};
        System.out.println("Length of the Longest Increasing Subsequence: "+ longestIncSeqSolution.lengthOfLIS(arr));
    }
}
