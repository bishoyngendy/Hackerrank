package code.Algorithms.Strings.Mars_Exploration;

import code.InputReader;
import java.io.PrintWriter;

public class Task {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        String pattern = "SOS";
        String s = in.next();
        int count = s.length()/3;
        int ret = 0;
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < pattern.length(); j++) {
                if (s.charAt(j + 3 * i) != pattern.charAt(j)) {
                    ret++;
                }
            }
        }
        out.print(ret);
    }
}
