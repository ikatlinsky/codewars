package com.ikatlinsky.codewars;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

/**
 * @author ikatlinsky
 * @since 9/2/15
 */
@RunWith(Parameterized.class)
public class FrogJumpingTest {

    private int[] input;
    private int expected;

    public FrogJumpingTest(int[] a, int expected) {
        this.input = a;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new int[]{1, 2, 2, -1}, 4},
                {new int[]{1, 2, 1, 5}, 3},
                {new int[]{1, 1, 1, 1, 5, 1, 1, 1, 1, 1, 1, 1, 1}, 9},
                {new int[]{1, 2, 3, 1, -2, 1}, 6},
                {new int[]{1, 1, 1, 1}, 4},
                {new int[]{-1, -1, -2}, 1},
                {new int[]{-3}, 1},
                {new int[]{1, -1}, -1},
                {new int[0], -1},
                {new int[]{1, 2, 1, 2, -3, -4}, -1},
                {new int[]{1, 0, 2}, -1}

        });
    }

    @Test
    public void should_test_solution() {
        Assert.assertEquals(Arrays.toString(input), expected, FrogJumping.solution(input));
    }

    @Test
    public void test() {
        int pos = 0;
        int[] a = new int[] {1, 2, 3, 4, 5};

        pos += a[pos] | (a[pos] = 0) | (a[pos+1] = 0);
        System.out.println(pos);
    }


}