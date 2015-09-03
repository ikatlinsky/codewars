package com.ikatlinsky.codewars;

import java.util.stream.IntStream;
import java.util.stream.LongStream;

/**
 * @author ikatlinsky
 * @since 8/30/15
 */
public class Sequence {

    public static int nthterm(int first, int n, int c) {
        if (n == 0) {
            return first;
        }

        return nthterm(first + c, n - 1, c);
    }

    public static long getScore(long n) {
        return 50 + 50 * LongStream.range(2, n + 1).sum();
    }

}
