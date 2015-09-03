package com.ikatlinsky.codewars;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

/**
 * @author ikatlinsky
 * @since 9/1/15
 */
public class MorseCodeDecoderTest {

    @Test
    public void testStringSplit_LeftSplitter() {
        String bits = "1100110011001100000011000000111111001100111111001111110000000000000011001111110011111100111111000000110011001111110000001111110011001100000011";

        String morse = MorseCodeDecoder.decodeBits(bits);
        assertThat(morse, not(equalTo("")));
    }

    @Test
    public void testSplitteration() {
        Pattern stuff = Pattern.compile("[1]+|[0]+");
        Matcher matcher = stuff.matcher("111110011110111100011111100");
        List<String> matchList = new ArrayList<>();
        while (matcher.find()) {
            matchList.add(matcher.group(0)); // add match to the list
        }

        matchList.stream().forEach(System.out::println);
    }

    @Test
    public void Test1() {
        assertEquals("ABC", Dubstep.SongDecoder("WUBWUBABCWUB"));
    }

    @Test

    public void Test2() {
        assertEquals("R L", Dubstep.SongDecoder("RWUBWUBWUBLWUB"));
    }
}
