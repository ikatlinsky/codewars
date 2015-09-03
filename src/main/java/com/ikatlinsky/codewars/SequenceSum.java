package com.ikatlinsky.codewars;

import java.util.stream.IntStream;

/**
 * @author ikatlinsky
 * @since 8/29/15
 */
public class SequenceSum {

    public static int[] sumOfN(int n) {
        int len = Math.abs(n) + 1;
        int sign = n != 0 ? n / Math.abs(n) : 1;

        return IntStream.range(0, len)
                .map(i -> (IntStream.range(0, i).sum() + i) * sign)
                .toArray();
    }
}