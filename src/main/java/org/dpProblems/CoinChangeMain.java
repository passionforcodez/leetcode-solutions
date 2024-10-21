package org.dpProblems;

import java.util.Arrays;

class CoinChangeSolution {
    public int coinChange (int[] coins, int amount) {
        // Dp table to store the fewest coins needed for each amount
        int[] dp = new int[amount+1]; // 0-amount

        // initialize the table with a large value (effectively infinite)
        Arrays.fill(dp, amount+1);
        // Base case if no coins are needed to make amount 0
        dp[0] = 0;
        // Build the table
        for (int i = 1; i <= amount; i++) {
            for (int coin: coins) {
                if (coin <= i) {
                    dp[i] = Math.min(dp[i], dp[i-coin] +1);
                }
            }
        }
        // If dp[amount] is still infinity, return -1 otherwise return dp[amount]
        return dp[amount] > amount ? -1 : dp[amount];
    }
}

public class CoinChangeMain {
    public static void main(String[] args) {
        CoinChangeSolution coinChangeSolution = new CoinChangeSolution();
        int[] coins = {1,2,5};
        int amount = 11;
        System.out.println("Minimum coins required: " + coinChangeSolution.coinChange(coins, amount));
    }
}

// dp = [0, 1, 1, 2, 2, 1, 2, 2, 3, 3, 2, 3]
// dp[] = [dp[0], dp[1], dp[2], ..., dp[11]]
// time Complexity = O(amount * coins.length)
// Space Complexity = O(amount)
