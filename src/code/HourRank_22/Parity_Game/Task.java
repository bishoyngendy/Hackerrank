package code.HourRank_22.Parity_Game;

import code.InputReader;
import java.io.PrintWriter;

public class Task {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int n = in.nextInt();
        int[] numbers = in.nextIntArray(n);
        int even = 0;
        int odd = 0;
        for (int i = 0; i < n; i++) {
            if (numbers[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        if (even > 0) {
            if (odd % 2 == 0) {
                out.print(0);
            } else {
                out.print(1);
            }
        } else {
            if (odd == 1) {
                out.print(-1);
            } else if (odd % 2 == 0) {
                out.print(0);
            } else {
                out.print(1);
            }
        }

    }
}
