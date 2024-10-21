package org.dpProblems;

class FibSolution {
    public int fib(int n) {
        if (n <= 1) {
            return n;
        }
        // Initialize the base fib values
        int prev2 = 0; // f[0]
        int prev1 = 1; // f[1]
        int current = 0;

        // Claculate the fibonacci series.
        for (int i = 2; i <= n; i++) {
            current = prev1 + prev2;
            prev2 = prev1;
            prev1 = current;
        }
        return current;
    }
}

public class FibonacciSequenceMain {
    public static void main(String[] args) {
        FibSolution fibSolution = new FibSolution();
        int n = 10;
        System.out.println("Fib of " + n + " is: " + fibSolution.fib(n));
    }
}
