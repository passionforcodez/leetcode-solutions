package org.dpProblems;

// Given n items, each with a weight and a value,
// determine the maximum value that can be obtained by
// selecting a subset of items such
// that the total weight does not exceed a given weight W.

class KnapsackSolution {
    public int knapsack(int[] weights, int[] values, int W) {
        int n = values.length;
        // 2D array dp[i][W]
        int[][] dp = new int[n+1][W +1];
        // Build a dp table
        for (int i = 0; i <= n; i++) {
            for (int w = 0; w <= W; w++){
                // Base case: no item or capacity
                if (i == 0 || w == 0) {
                    dp[i][w] = 0;
                } else if (weights[i -1] <= w) {
                    // option to include or exclude the current items
                    dp[i][w] = Math.max(values[i-1] + dp[i-1][w- weights[i-1]], dp[i-1][w]);
                } else {
                    // Exclude the current items
                    dp[i][w] =dp[i-1][w];
                }
            }
        }
        // The bottom right corner contains the maximum value.
        return dp[n][W];
    }
}

public class KnapsackMain {
    public static void main(String[] args) {
        KnapsackSolution knapsackSolution = new KnapsackSolution();
        int[] values = {60, 100, 120};
        int[] weights = {10, 20, 30};
        int W = 50;
        System.out.println("Maximum values: "+ knapsackSolution.knapsack(weights, values, W));
    }
}
