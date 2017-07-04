package code.Algorithms.Sorting.Closest_Numbers;

import code.InputReader;
import java.io.PrintWriter;
import java.util.Arrays;

public class Task {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int n = in.nextInt();
        long[] numbers = new long[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = in.nextLong();
        }
        Arrays.sort(numbers);
        long difference = Long.MAX_VALUE;
        for (int i = 1; i < n; i++) {
            difference = Math.min(difference, numbers[i] - numbers[i - 1]);
        }

        for (int i = 1; i < n; i++) {
            if (difference ==  numbers[i] - numbers[i - 1]) {
                out.print(numbers[i - 1] + " " + numbers[i] + " ");
            }
        }
    }
}
