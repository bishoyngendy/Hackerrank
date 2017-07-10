package code.Algorithms.Implementation.Counting_Valleys;

import code.InputReader;
import java.io.PrintWriter;

public class Task {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int n = in.nextInt();
        String s = in.next();
        int currentLevel = 0;
        int valleys = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'U') {
                currentLevel++;
            } else {
                currentLevel--;
            }
            if (s.charAt(i) == 'U' && currentLevel == 0) {
                valleys++;
            }
        }
        out.print(valleys);
    }
}
