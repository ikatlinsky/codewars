package com.ikatlinsky.codewars;

import java.util.stream.IntStream;

/**
 * @author ikatlinsky
 * @since 8/29/15
 */
public class NthSeries {

    public static String seriesSum(int n) {
        if (n == 0) {
            return "0.00";
        }

        int[] bases = new int[n];
        Double value = IntStream.range(1, n + 1)
                .mapToDouble(i -> {
                    if (i == 1) {
                        bases[i - 1] = 1;
                        return 1;
                    }

                    bases[i - 1] = bases[i - 2] + 3;
                    return 1. / (bases[i - 1]);
                }).sum();

        return String.format("%.2f", value);
    }
}
