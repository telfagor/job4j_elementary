package ru.job4j.array;

import org.junit.Test;
import org.junit.Assert;

public class MinTest {

    @Test
    public void whenFirstMin() {
        int[] data = {0, 5, 10};
        int rsl = Min.findMin(data);
        int expected = 0;
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void whenLastMin() {
        int[] data = {5, 10, 0};
        int rsl = Min.findMin(data);
        int expected = 0;
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void whenMiddleMin() {
        int[] data = {5, 0, 10};
        int rsl = Min.findMin(data);
        int expected = 0;
        Assert.assertEquals(expected, rsl);
    }
}