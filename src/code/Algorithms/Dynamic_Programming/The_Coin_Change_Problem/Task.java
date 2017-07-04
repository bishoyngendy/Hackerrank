package code.Algorithms.Dynamic_Programming.The_Coin_Change_Problem;

import code.InputReader;
import java.io.PrintWriter;
import java.util.Arrays;

public class Task {
    private int n;
    private int m;
    private int[] coins;
    private long[][] dp;

    public void solve(int testNumber, InputReader in, PrintWriter out) {
        n = in.nextInt();
        m = in.nextInt();
        coins = in.nextIntArray(m);
        dp = new long[n + 1][m];

        for (int i = 0; i < dp.length; i++) {
            Arrays.fill(dp[i], -1);
        }

        out.print(getResult(0, 0));
    }

    private long getResult(int collected, int index) {
        if (collected == n) {
            return 1;
        } else if (collected > n) {
            return 0;
        } else if (dp[collected][index] != -1) {
            return dp[collected][index];
        }

        long ways = 0;
        for (int i = index; i < m; i++) {
            ways += getResult(collected + coins[i] ,i);
        }
        dp[collected][index] = ways;
        return ways;
    }
}
