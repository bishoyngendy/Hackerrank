import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author programajor
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Task solver = new Task();
        solver.solve(1, in, out);
        out.close();
    }

    static class Task {
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
                ways += getResult(collected + coins[i], i);
            }
            dp[collected][index] = ways;
            return ways;
        }

    }

    static class InputReader {
        private BufferedReader reader;
        private StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public int[] nextIntArray(int s) {
            int[] in = new int[s];
            for (int i = 0; i < s; i++) {
                in[i] = nextInt();
            }
            return in;
        }

    }
}

