package com.ikatlinsky.codewars;

/**
 * @author ikatlinsky
 * @since 8/30/15
 */
public class TriangleNumbers {

    public static Boolean isTriangleNumber(long number) {
        if (number == 1 || number == 0) {
            return true;
        }

        long delta = 1;

        while (number > 0) {
            number = number - delta;
            delta++;
        }

        return number == 0;
    }
}
