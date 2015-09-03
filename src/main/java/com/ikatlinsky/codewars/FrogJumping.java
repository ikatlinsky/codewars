package com.ikatlinsky.codewars;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author ikatlinsky
 * @since 9/2/15
 */
public class FrogJumping {

    public static int solution(int[] a) {
        Map<Integer, Integer> map = IntStream.range(0, a.length).boxed().collect(Collectors.toMap(i -> i, i -> 2));

        if (a.length == 0 || Arrays.binarySearch(a, 0) > 0) {
            return -1;
        }

        int count = 1;
        int position = 0;

        while (position >= 0 && position < a.length) {
            int nextPosition = a[position];

            if (map.get(position) == 0) {
                return -1;
            }

            map.put(position, map.get(position) - 1);
            count++;
            position = position + nextPosition;
        }

        return count - 1;
    }
}