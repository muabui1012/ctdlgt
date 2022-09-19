import edu.princeton.cs.algs4.*;
import java.io.*;
import java.util.*;
import java.util.Vector;

public class three_sum {

    public static void main(String[] args) {
       int N = StdIn.readInt();
        Vector<Integer> v = new Vector<Integer>();
        for (int i = 0; i < N; i++) {
            int t = StdIn.readInt();
            v.add(t);
        }
        int count = 0;
        for (int i = 0; i < N-2; i++) {
            for (int j = i + 1; j < (N - 1); j++) {
                for (int k = j + 1; k < (N); k++) {
                    if (v.get(i) + v.get(j) + v.get(k) == 0 && i != j && j != k && i != k) {
                        count++;
                        StdOut.println(v.get(i) + " " + v.get(j) + " " + v.get(k));
                    }
                }
            }
        }
        StdOut.println("Using 2 pointer++");
        Collections.sort(v);
        for (int i = 0; i < N; i++) {
            int j = i + 1;
            int k = N - 1;
            while (j < k) {
                int val = v.get(i) + v.get(j) + v.get(k);
                if (val == 0) {
                    StdOut.println(v.get(i) + " " + v.get(j) + " " + v.get(k));
                    j++;
                    k--;
                } else if (val < 0)
                    j++;
                else
                    k--;

            }
        }


    }


}
