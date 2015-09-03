package com.ikatlinsky.codewars;

import java.util.Arrays;

/**
 * @author ikatlinsky
 * @since 9/1/15
 */
public class Persist {

    public static int persistence(long n) {
        if (n < 10) return 0;

        final long newN = Arrays.stream(String.valueOf(n).split(""))
                .mapToLong(Long::valueOf)
                .reduce(1, (acc, next) -> acc * next);

        return persistence(newN) + 1;
    }
}