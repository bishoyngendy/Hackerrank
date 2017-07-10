package code.Algorithms.Strings.HackerRank_in_a_String;

import code.InputReader;
import java.io.PrintWriter;

public class Task {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int testCases = in.nextInt();
        String hackerrank = "hackerrank";
        while (testCases-- != 0) {
            String s = in.next();
            int index = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == hackerrank.charAt(index)) {
                    index++;
                }
                if (index == hackerrank.length()) {
                    out.println("YES");
                    break;
                } else if (i == s.length() - 1){
                    out.println("NO");
                    break;
                }
            }
        }
    }
}
