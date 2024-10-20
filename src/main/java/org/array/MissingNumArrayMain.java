package org.array;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

class MissNumSolution {
    int[] arr = {1,2,3,5,6,7,8,10};
    ArrayList<Integer> result = new ArrayList<>();
    public int[] missNum() {
        for (int i = 0; i < arr.length - 1 ; i++) {
            while (arr[i]+1 != arr[i+1]) {
                result.add(arr[i]+1);
                arr[i]++;
            }
        }
        return result.stream().mapToInt(i -> i).toArray();
    }
}
public class MissingNumArrayMain {
    public static void main(String args[]) {

        MissNumSolution missNumSolution = new MissNumSolution();
        // Print the missing numbers
        System.out.println("Missing Numbers: " + Arrays.toString(missNumSolution.missNum()));
    }
}

// Time Complexity: O(n) : The total time complexity is still O(n)
// because the algorithm efficiently handles checking for missing numbers in a linear scan.
// The outer loop iterates through the elements of the array from the first to the second-to-last element.
// This means it will always run n - 1 times, where n is the length of the array.
// The inner while loop checks for missing numbers between consecutive elements.
//When i = 4, it checks arr[4] + 1 != arr[5] (i.e., 5 + 1 != 7), which is true.
//It will enter the inner loop, find the missing number 6, and add it to the result.
// The inner loop runs exactly once for this particular scenario.
// Space Complexity: O(m) where m is the missing numbers.

