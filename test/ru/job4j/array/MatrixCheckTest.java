package ru.job4j.array;

import org.junit.Test;
import org.junit.Assert;

public class MatrixCheckTest {

    @Test
    public void whenHasMonoHorizontal() {
        char[][] input = {
                {' ', ' ', ' '},
                {'X', 'X', 'X'},
                {' ', ' ', ' '},
        };

        int row = 1;
        boolean rsl = MatrixCheck.monoHorizontal(input, row);
        Assert.assertTrue(rsl);
    }

    @Test
    public void whenHasMonoVertical() {
        char[][] input = {
                {' ', ' ', 'X'},
                {' ', ' ', 'X'},
                {' ', ' ', 'X'}
        };

        int column = 2;
        boolean rsl = MatrixCheck.monoVertical(input, column);
        Assert.assertTrue(rsl);
    }
}