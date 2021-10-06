package ru.job4j.array;

import org.junit.Test;
import org.junit.Assert;

public class MatrixTest {

    @Test
    public void when2On2() {
        int size = 2;
        int[][] expected = {
                {1, 2},
                {2, 4}
        };
        int[][] rsl = Matrix.multiple(size);

        Assert.assertArrayEquals(expected, rsl);
    }
}