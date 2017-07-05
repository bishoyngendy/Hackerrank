package code.Algorithms.Greedy.Grid_Challenge;

import code.InputReader;
import java.io.PrintWriter;
import java.util.Arrays;

public class Task {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int testCases = in.nextInt();
        while (testCases-- != 0) {
            int n = in.nextInt();
            char[][] strings = new char[n][n];
            for (int i = 0; i < n; i++) {
                String s = in.next();
                char[] line = s.toCharArray();
                Arrays.sort(line);
                strings[i] = line;
            }
            boolean check = true;
            for (int i = 0; i < n; i++) {
                for (int j = 1; j < n; j++) {
                    if (strings[j][i] < strings[j - 1][i]) {
                        out.println("NO");
                        check = false;
                        i = j = Integer.MAX_VALUE;
                    }
                }
            }
            if (check) {
                out.println("YES");
            }
        }
    }
}
