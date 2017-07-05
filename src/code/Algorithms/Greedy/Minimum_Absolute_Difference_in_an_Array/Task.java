package code.Algorithms.Greedy.Minimum_Absolute_Difference_in_an_Array;

import code.InputReader;
import java.io.PrintWriter;
import java.util.Arrays;

public class Task {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int n = in.nextInt();
        int[] array = in.nextIntArray(n);
        Arrays.sort(array);
        int difference = Integer.MAX_VALUE;
        for (int i = 1; i < n; i++) {
            difference = Math.min(difference, array[i] - array[i - 1]);
        }
        out.print(difference);
    }
}
