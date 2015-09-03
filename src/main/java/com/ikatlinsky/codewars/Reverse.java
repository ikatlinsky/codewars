package com.ikatlinsky.codewars;

/**
 * @author ikatlinsky
 * @since 8/29/15
 */
public class Reverse {

    public String reverse(String str) {
        if (str == null || str == "" || str.length() <= 1) {
            return str;
        }

        return reverse(str.substring(1)) + str.charAt(0);
    }
}
