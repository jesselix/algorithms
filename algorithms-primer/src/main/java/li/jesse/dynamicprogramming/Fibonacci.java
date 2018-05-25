package li.jesse.dynamicprogramming;

public class Fibonacci {

    public static int fib(int i) {
        if (i == 1 || i == 2) {
            return 1;
        } else {
            return fib(i - 1) + fib(i - 2);
        }
    }

    public static int fib2(int n) {
        int[] memo = new int[1000];

        if (n == 1 || n == 2) {
            return 1;
        }
        if(memo[n] != 0)
            return memo[n];

        memo[n] = fib2(n - 1) + fib2(n - 2);
        return memo[n];
    }

    public static int fib3(int n) {
        int[] memo = new int[n + 1];
        memo[0] = 0;
        memo[1] = 1;

        for(int i = 2; i <= n; i++) {
            memo[i] = memo[i - 1] + memo[i - 2];
        }

        return memo[n];
    }

}
