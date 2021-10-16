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

    @Test
    public void whenDiagonalFullX() {
        char[][] input = {
                {'X', ' ', ' '},
                {' ', 'X', ' '},
                {' ', ' ', 'X'}
        };

        char[] rsl = MatrixCheck.extractDiagonal(input);
        char[] expected = {'X', 'X', 'X'};
        Assert.assertArrayEquals(expected, rsl);
    }

    @Test
    public void whenDiagonalFullOne() {
        char[][] input = {
                {'1', ' ', ' '},
                {' ', '1', ' '},
                {' ', ' ', '1'}
        };

        char[] rsl = MatrixCheck.extractDiagonal(input);
        char[] expected = {'1', '1', '1'};
        Assert.assertArrayEquals(expected, rsl);
    }

    @Test
    public void whenDiagonalMix() {
        char[][] input = {
                {'X', ' ', ' '},
                {' ', 'Y', ' '},
                {' ', ' ', 'Z'}
        };

        char[] rsl = MatrixCheck.extractDiagonal(input);
        char[] expected = {'X', 'Y', 'Z'};
        Assert.assertArrayEquals(expected, rsl);
    }

    @Test
    public void whenNotMonoRow() {
        char[][] input = {
                {' ', ' ', 'X'},
                {' ', 'Y', ' '},
                {'Z', ' ', ' '}
        };
        int row = 2;
        boolean rsl = MatrixCheck.isMonoRow(input, row);
        Assert.assertFalse(rsl);
    }

    @Test
    public void whenNotMonoColumn() {
        char[][] input = {
                {'X', 'Y', 'Z'},
                {' ', ' ', ' '},
                {' ', ' ', ' '}
        };
        int column = 1;
        boolean rsl = MatrixCheck.isMonoColumn(input, column);
        Assert.assertFalse(rsl);
    }
}