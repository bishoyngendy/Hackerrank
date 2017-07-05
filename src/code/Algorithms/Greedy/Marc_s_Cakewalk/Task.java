package code.Algorithms.Greedy.Marc_s_Cakewalk;

import code.InputReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Collections;

public class Task {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int n = in.nextInt();
        Integer[] calories = new Integer[n];
        for (int i = 0; i < n; i++) {
            calories[i] = in.nextInt();
        }
        Arrays.sort(calories, Collections.reverseOrder());
        long ret = 0;
        for (int i = 0; i < n; i++) {
            ret = (long) (ret + calories[i] * Math.pow(2, i));
        }
        out.print(ret);
    }
}
