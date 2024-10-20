package org.importantEasy;

import java.util.Arrays;

class MaxSumSubArray {
    int[] a = {-1,-2,0,2,2,6};
    // Write the Maximum sum SubArray.
    public int[] maxSumSubArray() {
        int maxSoFar = a[0];
        int currentMax = a[0];
        int start = 0, end = 0, tempStart = 0;
        for (int i = 1; i < a.length; i++) {
            if (a[i] > currentMax + a[i]) {
                currentMax = a[i];
                tempStart = i;
            } else {
                currentMax += a[i];
            }
            if (currentMax > maxSoFar) {
                maxSoFar = currentMax;
                start = tempStart;
                end = i;
            }
        }
        return Arrays.copyOfRange(a, start, end + 1);
    }
    // Total sum for subArray
    public int maxSum(){
        int maxSoFar = a[0];
        int currentMax = a[0];
        for (int i = 1; i < a.length; i++) {
            currentMax = Math.max(a[i], currentMax + a[i]);
            maxSoFar = Math.max(maxSoFar, currentMax);
        }
        return maxSoFar;
    }
}
public class MaxSumSubarrayMain {
    public static void main (String[] args) {
        MaxSumSubArray maxSumSubArray = new MaxSumSubArray();
        System.out.println("Max Sum of subarray: " + Arrays.toString(maxSumSubArray.maxSumSubArray()));
        System.out.println("Max Sum: "+ maxSumSubArray.maxSum());
    }
}
