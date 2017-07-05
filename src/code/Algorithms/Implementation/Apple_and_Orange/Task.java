package code.Algorithms.Implementation.Apple_and_Orange;

import code.InputReader;
import java.io.PrintWriter;

public class Task {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int apples = 0;
        int oranges = 0;
        for (int i = 0; i < m; i++) {
            int x = in.nextInt();
            if ((a + x >= s) && (a + x <= t)) {
                apples++;
            }
        }
        for (int i = 0; i < n; i++) {
            int x = in.nextInt();
            if ((b + x >= s) && (b + x <= t)) {
                oranges++;
            }
        }
        out.println(apples);
        out.print(oranges);
    }
}
