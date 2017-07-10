package code.Algorithms.Implementation.Jumping_on_the_Clouds_Revisited;

import code.InputReader;
import java.io.PrintWriter;

public class Task {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int n = in.nextInt();
        int k = in.nextInt();
        int c[] = in.nextIntArray(n);
        int energy = 100;
        int current = 0;
        do {
            int next = (current + k) % n;
            energy--;
            if (c[next] == 1) energy -= 2;
            current = next;
        } while (current != 0);
        out.print(energy);
    }
}
