package ru.job4j.condition;

import org.junit.Test;

import org.junit.Assert;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int expected = 2;
        int rsl = Max.max(1, 2);
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void whenMax2To1Then2() {
        int left = 2;
        int right = 1;
        int expected = 2;
        int rsl = Max.max(2, 1);
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void whenMax2To2Then2() {
        int left = 2;
        int right = 2;
        int expected = 2;
        int rsl = Max.max(2, 2);
        Assert.assertEquals(expected, rsl);
    }
}