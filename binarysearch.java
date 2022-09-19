import java.lang.*;
import java.util.Collections;
import java.util.Vector;
import java.io.*;

import edu.princeton.cs.algs4.*;


public class binarysearch {

    /**
     *
     * @param N
     * @param a
     * @param key
     * @return index of key in a if it exists
     */
    public static int binary_search(int N, Vector<Integer> a, int key) {


        int l = 0;
        int r = N - 1;
        int mid = (l + r) / 2;
        boolean found = false;
        while (r - l > 1) {
            mid = (l + r) / 2;
            if (a.get(mid) < key) {
                l = mid + 1;
            }
            else {
                r = mid;
            }
        }
        if (a.get(l) == key) {
            return l;
        }
        if (a.get(r) == key) {
            return r;
        }
        if (a.get(mid) == key) {
            return mid;
        }
        return -1;
    }

    public static void main(String[] args) {

        int N = StdIn.readInt();
        Vector<Integer> a = new Vector<Integer>();
        for (int i = 0; i < N; i++){
            a.add(StdIn.readInt());
        }
        Collections.sort(a);
        long s_time = System.nanoTime();

        for (int i = 0; i < N; i++) {
            StdOut.print(a.get(i));
        }

        StdOut.println();
        int count = 0;
        for (int i = 0; i < N; i++){
            if (a.get(i) <= 0) {
                int j = binary_search(N, a, -a.get(i));
                if (j != -1 && i != j) {
                    StdOut.println(a.get(i) + " " + a.get(j));
                    ++count;
                }
            }
        }


        long e_time = System.nanoTime();
        StdOut.println(e_time - s_time);
        /* Using 2 pointers */





    }



}
