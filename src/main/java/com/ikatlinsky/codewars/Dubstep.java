package com.ikatlinsky.codewars;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * @author ikatlinsky
 * @since 9/1/15
 */
public class Dubstep {

    public static String SongDecoder(String song) {
        song = song.replaceAll("^(WUB)+", "");
        song = song.replaceAll("(WUB)+$", "");

        return Arrays.stream(song.replaceAll("WUB", " ")
                .split(" ")).filter(w -> !"".equals(w.trim()))
                .map(String::trim)
                .collect(Collectors.joining(" "));
    }
}
