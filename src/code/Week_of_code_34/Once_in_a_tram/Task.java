package code.Week_of_code_34.Once_in_a_tram;

import code.InputReader;
import java.io.PrintWriter;

public class Task {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int x = in.nextInt();
        x++;
        while (x < 1000000) {
            int leftNum = x/1000;
            int rightNum = x - (leftNum * 1000);
            if (getSum(leftNum) == getSum(rightNum)) {
                printNum(leftNum);
                printNum(rightNum);
                return;
            }
            x++;
        }
    }

    private void printNum(int num) {
        if (num < 10) {
            System.out.print("00");
        } else if (num < 100) {
            System.out.print("0");
        }
        System.out.print(num);
    }

    private int getSum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
