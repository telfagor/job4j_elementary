package ru.job4j.array;

import org.junit.Test;
import org.junit.Assert;

public class SkipNegativeTest {

    @Test
    public void whenArrayRowAndColumnEquals() {
        int[][] data = {
                {1, -2},
                {1, 2}
        };

        int[][] rsl = SkipNegative.skip(data);
        int[][] expected = {
                {1, 0},
                {1, 2}
        };

        Assert.assertArrayEquals(expected, rsl);
    }

    @Test
    public void whenArrayRow4AndColumnNotEquals() {
        int[][] data = {
                {1, -2},
                {1, 2, -3},
                {1, -2, 3, -4},
                {1, 2, -3, -4, 5}
        };

        int[][] rsl = SkipNegative.skip(data);
        int[][] expected = {
                {1, 0},
                {1, 2, 0},
                {1, 0, 3, 0},
                {1, 2, 0, 0, 5}
        };

        Assert.assertArrayEquals(expected, rsl);
    }
}