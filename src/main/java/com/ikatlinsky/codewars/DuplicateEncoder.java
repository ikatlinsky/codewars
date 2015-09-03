package com.ikatlinsky.codewars;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * @author ikatlinsky
 * @since 8/30/15
 */
public class DuplicateEncoder {

    static String encode(String word){
        final String normalizedWord = word.toLowerCase();

        return Arrays.stream(normalizedWord.split(""))
                .map(letter -> normalizedWord.indexOf(letter) != normalizedWord.lastIndexOf(letter) ? ")" : "(")
                .collect(Collectors.joining());
    }
}
