package org.array;

class LargeSolution {
    // Find the largest element from an array
    int[] arr = {10, 324, 45, 90, 9};
    public int large() {
        int max = arr[0];
        for (int i= 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    public int secondLarge() {
        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int num: arr) {
            if (num > firstMax) {
                secondMax = firstMax;
                firstMax = num;
            }
            else if (num > secondMax && num != firstMax) {
                secondMax = num;
            }
        }
        return secondMax;
    }
}
public class LargeElementArrayMain {
    public static void main(String[] args) {
        LargeSolution largeSolution = new LargeSolution();
        System.out.println("Largest in given array is: " + largeSolution.large());
        System.out.println("Second Largest Element is: " + largeSolution.secondLarge());
    }
}

// Time Complexity: O(n)
// Space Complexity: O(1)
