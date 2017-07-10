package code.Algorithms.Implementation.Kangaroo;

import code.InputReader;
import java.io.PrintWriter;

public class Task {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        String result = kangaroo(x1, v1, x2, v2);
        out.print(result);
    }

    private String kangaroo(int x1, int v1, int x2, int v2) {
        if (v1 <= v2) {
            return "NO";
        }
        if ((x2 - x1) % (v1 - v2) == 0) {
            return "YES";
        } else {
            return "NO";
        }
    }
}
