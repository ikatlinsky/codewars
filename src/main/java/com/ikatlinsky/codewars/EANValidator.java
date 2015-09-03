package com.ikatlinsky.codewars;

import java.util.stream.IntStream;

/**
 * @author ikatlinsky
 * @since 8/30/15
 */
public class EANValidator {
    public static boolean validate(final String eanCode) {
        Integer[] digits = eanCode.chars()
                .mapToObj(Character::getNumericValue)
                .toArray(Integer[]::new);

        int sum = IntStream.range(0, digits.length - 1)
                .map(i -> (i + 1) % 2 * digits[i] + i % 2 * digits[i] * 3)
                .sum();

        int checksum =  sum % 10 == 0 ? 0 : 10 - sum % 10;

        return Integer.valueOf(eanCode.substring(12)).equals(checksum);
    }
}
