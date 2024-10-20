package org.array;

import java.util.Arrays;

class MergeTwoArraySolution {
    private int[] a = {2,7,5,1};
    private int[] b = {1,5,3,2};
    int alen = a.length;
    int blen = b.length;
    int clen = alen + blen;
    int[] result = new int[clen];
    public int[] merge() {
        for (int i = 0; i < alen; i++) {
            result[i] = a[i];
        }
        for (int i = 0; i < blen; i++) {
            result[i + alen] = b[i];
        }
        return result;
    }
}
public class MergeTwoArrayMain {
    public static void main(String args[]) {
        MergeTwoArraySolution mergeTwoArraySolutions = new MergeTwoArraySolution();
        System.out.println("Merged array: " + Arrays.toString(mergeTwoArraySolutions.merge()));
    }
}

// Time complexity- O(n+m)
// Space Complexity- O(n)