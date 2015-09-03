package com.ikatlinsky.codewars;

import java.util.stream.IntStream;

/**
 * @author ikatlinsky
 * @since 8/29/15
 */
public class Triangular {

    public static int triangular(int n) {
        return IntStream.range(0, n + 1).sum();
    }
}
