package code.Algorithms.Implementation.Birthday_Chocolate;

import code.InputReader;
import java.io.PrintWriter;

public class Task {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int n = in.nextInt();
        int[] s = in.nextIntArray(n);
        int d = in.nextInt();
        int m = in.nextInt();
        int numberOfWays = 0;
        for (int i = 0; i < n - m + 1; i++) {
            int sum = 0;
            for (int j = i; j < i + m; j++) {
                sum += s[j];
            }
            if (sum == d) {
                numberOfWays++;
            }
        }
        out.print(numberOfWays);
    }
}
