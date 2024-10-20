package org.subarray;

class CountNegSolution {
    int[] arr = {10, -1, 0, 2, -1, -2, -3, 4};
    public int countNegative() {
        int count = 0;
        int currentSum = 0;

        for (int i = 0; i < arr.length; i++) {
            currentSum = 0;
            for (int j = i; j < arr.length; j++) {
                currentSum += arr[j];
                if (currentSum < 0) {
                    count++;
                }
            }
        }
        return count;
    }
}
public class countNegativeSubArrayMain {
    public static void main(String args[]) {
        CountNegSolution count = new CountNegSolution();
        System.out.println("Negative Sum: "+ count.countNegative());
    }
}
