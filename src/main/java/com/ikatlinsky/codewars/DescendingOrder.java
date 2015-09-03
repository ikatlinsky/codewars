package com.ikatlinsky.codewars;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

/**
 * @author ikatlinsky
 * @since 8/29/15
 */
public class DescendingOrder {

    public static int sortDesc(final int num) {

        return Integer.parseInt(String.valueOf(num)
                .chars()
                .mapToObj(i -> String.valueOf(Character.getNumericValue(i)))
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.joining()));

    }
}