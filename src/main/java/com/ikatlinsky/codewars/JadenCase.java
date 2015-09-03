package com.ikatlinsky.codewars;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * @author ikatlinsky
 * @since 8/29/15
 */
public class JadenCase {

    public String toJadenCase(String phrase) {
        if (phrase == null || "".equals(phrase.trim())) {
            return null;
        }

        return Arrays.stream(phrase.split(" "))
                .map(s -> s.substring(0, 1).toUpperCase() + s.substring(1))
                .collect(Collectors.joining(" "));
    }

}
