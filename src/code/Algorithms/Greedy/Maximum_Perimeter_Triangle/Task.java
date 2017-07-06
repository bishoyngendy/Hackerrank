package code.Algorithms.Greedy.Maximum_Perimeter_Triangle;

import code.InputReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Collections;

public class Task {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int n = in.nextInt();
        Integer[] l = new Integer[n];
        for (int i = 0; i < n; i++) {
            l[i] = in.nextInt();
        }
        Arrays.sort(l, Collections.reverseOrder());
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (l[i] < (l[j] +l[k])) {
                        out.print(l[k] + " " + l[j] + " " + l[i]);
                        return;
                    }
                }
            }
        }
        out.print(-1);
    }
}
