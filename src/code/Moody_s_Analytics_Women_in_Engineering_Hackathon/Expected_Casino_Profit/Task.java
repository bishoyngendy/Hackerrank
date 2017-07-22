package code.Moody_s_Analytics_Women_in_Engineering_Hackathon.Expected_Casino_Profit;

import code.InputReader;
import java.io.PrintWriter;

public class Task {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int n = in.nextInt();
        int x = in.nextInt();
        int m = in.nextInt();
        double res = 0;
        for(int a0 = 0; a0 < n; a0++){
            int w = in.nextInt();
            int p = in.nextInt();
            res += (p/100.0) * (x - w);
        }
        out.print(res * m);
    }
}
