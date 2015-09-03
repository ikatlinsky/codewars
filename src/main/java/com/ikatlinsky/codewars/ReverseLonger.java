package com.ikatlinsky.codewars;

/**
 * @author ikatlinsky
 * @since 8/29/15
 */
public class ReverseLonger {

    public static String shorterReverseLonger(String a, String b) {
        String longer = a;
        String shorter = b;
        if (a.length() < b.length()) {
            longer = b;
            shorter = a;
        }

        return shorter + new StringBuilder(longer).reverse().toString() + shorter;
    }

}

