package code.Algorithms.Implementation.Bon_Appétit;

import code.InputReader;
import java.io.PrintWriter;

public class Task {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int n = in.nextInt();
        int k = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int b = in.nextInt();
        int totalActualCost = 0;
        for (int i = 0; i < n; i++) {
            if (i != k) {
                totalActualCost += ar[i];
            }
        }
        totalActualCost /= 2;
        if (totalActualCost == b) {
            out.print("Bon Appetit");
        } else {
            out.print(b - totalActualCost);
        }
    }
}
