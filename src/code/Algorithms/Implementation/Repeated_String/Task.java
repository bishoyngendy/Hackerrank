package code.Algorithms.Implementation.Repeated_String;

import code.InputReader;
import java.io.PrintWriter;

public class Task {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        String s = in.next();
        long n = in.nextLong();
        long counts = n/s.length();
        int countInOneWord = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
                countInOneWord++;
            }
        }
        long ret = countInOneWord * counts;
        int difference = (int) (n - s.length() * counts);
        for (int i = 0; i < difference; i++) {
            if (s.charAt(i) == 'a') {
                ret++;
            }
        }
        out.print(ret);
    }
}
