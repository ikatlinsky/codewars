package com.ikatlinsky.codewars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * @author ikatlinsky
 * @since 8/30/15
 */
public class MorseCodeDecoder {

    public static String decodeBits(String bits) {
        bits = bits.replaceAll("^0+", "");
        bits = bits.replaceAll("0+$", "");

        List<String> tokens = parseBits(bits);
        int dotLength = tokens.stream().filter(t -> t.startsWith("1")).map(String::length).min(Integer::compare).get();

        StringBuilder morse = new StringBuilder();

        for (String token : tokens) {
            if (token.startsWith("1")) {
                if (token.length() == dotLength) {
                    morse.append(".");
                } else {
                    morse.append("-");
                }
            } else {
                if (token.length() == 3 * dotLength) {
                    morse.append(" ");
                } else if (token.length() == 7 * dotLength) {
                    morse.append("   ");
                }
            }
        }

        return morse.toString();
    }

    public static String decodeMorse(String morseCode) {
        return Arrays.stream(morseCode.split("   "))
                .map(words -> Arrays.stream(words.split(" "))
//                        .map(MorseCode::get)
                        .filter(Objects::nonNull)
                        .collect(Collectors.joining()))
                .collect(Collectors.joining(" ")).trim();
    }

    private static List<String> parseBits(String bits) {
        Pattern pattern = Pattern.compile("[1]+|[0]+");
        Matcher matcher = pattern.matcher(bits);
        List<String> tokens = new ArrayList<>();
        while (matcher.find()) {
            tokens.add(matcher.group(0));
        }

        return tokens;
    }
}
