package com.ikatlinsky.codewars;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ikatlinsky
 * @since 8/29/15
 */
public class Kata {

    public static int alternateSqSum(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }

        Map<Integer, Integer> elementsMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            elementsMap.put(i, arr[i]);
        }

        return elementsMap.entrySet().stream().map(entry -> {
            if (entry.getKey() % 2 != 0) {
                entry.setValue(entry.getValue() * entry.getValue());
            }

            return entry.getValue();
        }).mapToInt(v -> v).sum();
    }

}