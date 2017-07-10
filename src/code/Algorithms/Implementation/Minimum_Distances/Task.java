package code.Algorithms.Implementation.Minimum_Distances;

import code.InputReader;
import java.io.PrintWriter;

public class Task {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int n = in.nextInt();
        int[] a = in.nextIntArray(n);

        int ret = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] == a[j]) {
                    ret = Math.min(ret, j - i);
                }
            }
        }
        out.print(ret == Integer.MAX_VALUE ? -1 : ret);
    }
}
