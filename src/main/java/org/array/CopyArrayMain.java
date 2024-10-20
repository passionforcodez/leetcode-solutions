package org.array;

import java.util.Arrays;

class CopyArraySolution{
    int[] a = {11, 324, 45, 90, 9};
    public int[] copyArray() {
        int[] b = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }
        return b;
    }
}
public class CopyArrayMain {
    public static void main(String[] args) {
        CopyArraySolution solution = new CopyArraySolution();
        System.out.println("Copy array: "+ Arrays.toString(solution.copyArray()));
    }
}
