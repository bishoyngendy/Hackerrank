package code.Algorithms.Implementation.Electronics_Shop;

import code.InputReader;
import java.io.PrintWriter;
import java.util.Arrays;

public class Task {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int s = in.nextInt();
        int n = in.nextInt();
        int m = in.nextInt();
        int[] keyboards = new int[n];
        for(int keyboards_i = 0; keyboards_i < n; keyboards_i++){
            keyboards[keyboards_i] = in.nextInt();
        }
        int[] drives = new int[m];
        for(int drives_i = 0; drives_i < m; drives_i++){
            drives[drives_i] = in.nextInt();
        }
        int moneySpent = getMoneySpent(keyboards, drives, s);
        System.out.print(moneySpent);
    }

    static int getMoneySpent(int[] keyboards, int[] drives, int s) {
        int ret = Integer.MIN_VALUE;
        for (int i = 0; i < keyboards.length; i++) {
            for (int j = 0; j < drives.length; j++) {
                if (keyboards[i] + drives[j] <= s) {
                    ret = Math.max(ret, keyboards[i] + drives[j]);
                }
            }
        }
        if (ret == Integer.MIN_VALUE) return -1;
        else return ret;
    }
}
