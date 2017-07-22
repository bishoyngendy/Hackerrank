import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
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
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int[] p = new int[n];
            for (int p_i = 0; p_i < n; p_i++) {
                p[p_i] = in.nextInt();
            }
            int[] d = new int[n];
            for (int d_i = 0; d_i < n; d_i++) {
                d[d_i] = in.nextInt();
            }
            String result = getSolution(n, p, d);
            out.println(result);
        }

        private String getSolution(int n, int[] p, int[] d) {
            for (int i = 1; i < n; i++) {
                if (!isCorrelated(i, p, d)) {
                    return "No";
                }
            }
            return "Yes";
        }

        private boolean isCorrelated(int i, int[] p, int[] d) {
            if (p[i] < p[i - 1] && d[i] < d[i - 1]) return true;
            if (p[i] > p[i - 1] && d[i] > d[i - 1]) return true;
            if (p[i] == p[i - 1] && d[i] == d[i - 1]) return true;
            return false;
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

    }
}

