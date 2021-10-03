package ru.job4j.array;

import org.junit.Test;
import org.junit.Assert;

public class MinDiapasonTest {

    @Test
    public void whenFirstMin() {
        int[] array = {-1, 0, 5, 10};
        int start = 1;
        int finish = 3;
        int rsl = MinDiapason.findMin(array, start, finish);
        int expected = 0;
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void whenMiddleMin() {
        int[] array = {10, 2, 5, 1};
        int start = 0;
        int finish = 2;
        int rsl = MinDiapason.findMin(array, start, finish);
        int expected = 2;
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void whenLastMin() {
        int[] array = {10, 5, 3, 1};
        int start = 1;
        int finish = 3;
        int rsl = Min.findMin(array);
        int expected = 1;
        Assert.assertEquals(expected, rsl);
    }
}