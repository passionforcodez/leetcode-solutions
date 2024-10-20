package org.importantEasy;

class ClimbingStairs{
    public int climbingWays(int stairs) {
        if (stairs == 1) {
            return 1;
        }
        if (stairs == 2) {
            return 2;
        }
        int oneStepBefore = 2;
        int twoStepBefore = 1;
        int allWays = 0;
        for (int i = 3; i <= stairs; i++) {
            allWays = oneStepBefore + twoStepBefore;
            twoStepBefore = oneStepBefore;
            oneStepBefore = allWays;
        }
        return allWays;
    }
}
public class ClimbingStairsMain {
    public static void main(String[] args) {
        int stairs = 5;
        ClimbingStairs climbingStairs = new ClimbingStairs();
        System.out.println("Ways to Climb " + stairs + "steps: " + climbingStairs.climbingWays(stairs));
    }
}

