package com.ikatlinsky.codewars;

import java.util.Arrays;

/**
 * @author ikatlinsky
 * @since 8/29/15
 */
public class UniqueArray {

    public static int[] unique(int[] integers) {
        return Arrays.stream(integers).distinct().toArray();
    }
}
