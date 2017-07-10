package code;

import code.InputReader;
import java.io.PrintWriter;
import java.util.Arrays;

public class Task {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int n = in.nextInt();
        int[] arr = in.nextIntArray(n);
        Arrays.sort(arr);
        int q = in.nextInt();
        while (q-- != 0) {
            int num = in.nextInt();
            int low = 0;
            int high = n-1;
            while (low <= high) {
                int mid = (low + high)/2;
                if (arr[mid] == num) {
                    out.println(mid + 1);
                    break;
                } else if (arr[mid] < num) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
    }
}
