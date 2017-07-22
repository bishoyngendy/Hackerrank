package code.Moody_s_Analytics_Women_in_Engineering_Hackathon.Strong_Correlation;

import code.InputReader;
import java.io.PrintWriter;

public class Task {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int n = in.nextInt();
        int[] p = new int[n];
        for(int p_i = 0; p_i < n; p_i++){
            p[p_i] = in.nextInt();
        }
        int[] d = new int[n];
        for(int d_i = 0; d_i < n; d_i++){
            d[d_i] = in.nextInt();
        }
        String result = getSolution(n, p, d);
        out.println(result);
    }

    private String getSolution(int n, int[] p, int[] d) {
        for (int i = 1; i < n; i++) {
            if (!isCorrelated(i, p, d)) {
                return "No";
            }
        }
        return "Yes";
    }

    private boolean isCorrelated(int i, int[] p, int[] d) {
        if (p[i] < p[i-1] && d[i] < d[i-1]) return true;
        if (p[i] > p[i-1] && d[i] > d[i-1]) return true;
        if (p[i] == p[i-1] && d[i] == d[i-1]) return true;
        return false;
    }

}
