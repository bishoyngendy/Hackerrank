package code.Algorithms.Implementation.Beautiful_Days_at_the_Movies;

import code.InputReader;
import java.io.PrintWriter;

public class Task {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int x = in.nextInt();
        int y = in.nextInt();
        int k = in.nextInt();
        int ret = 0;

        for (int i = x; i <= y; i++) {
            if (satisfy(i, k)) {
                ret++;
            }
        }
        out.print(ret);
    }

    private boolean satisfy(int number, int k) {
        return ((Math.abs(number - reverse(number))) % k == 0);
    }

    private int reverse(int number) {
        int ret = 0;
        while (number > 0) {
            ret *= 10;
            ret += number % 10;
            number /= 10;
        }
        return ret;
    }
}
