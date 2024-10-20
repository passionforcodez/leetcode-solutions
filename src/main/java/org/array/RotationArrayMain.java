package org.array;

import java.util.Arrays;

class RotationSolution {
    int[] arr = {3,2,1,7,10};
    int n = arr.length;
    public int[] rotate() {
        int left = 0, right = n-1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left ++;
            right --;
        }
        return arr;
    }
}

public class RotationArrayMain {
    public static void main (String args[]) {
        RotationSolution solution = new RotationSolution();
        System.out.println("Merged array: " + Arrays.toString(solution.rotate()));
    }
}

// Time complexity- O(n)
// Space Complexity- O(1)