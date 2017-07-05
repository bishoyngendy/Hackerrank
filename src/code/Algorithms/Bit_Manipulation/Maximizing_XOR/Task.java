package code.Algorithms.Bit_Manipulation.Maximizing_XOR;

import code.InputReader;
import java.io.PrintWriter;

public class Task {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int l = in.nextInt();
        int r = in.nextInt();
        long ret = Integer.MIN_VALUE;
        for (int i = l; i <= r; i++) {
            for (int j = i; j <= r; j++) {
                ret = Math.max(ret, i ^ j);
            }
        }
        out.print(ret);
    }
}
