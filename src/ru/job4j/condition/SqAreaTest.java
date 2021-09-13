package ru.job4j.condition;

import org.junit.Test;

import org.junit.Assert;

public class SqAreaTest {

    @Test
    public void whenP4K1Then1() {
        int p = 4;
        int k = 1;
        double expected = 1;
        double rsl = SqArea.square(p, k);
        Assert.assertEquals(expected, rsl, 0.01);
    }

    @Test
    public void whenP6K2Then2() {
        int p = 6;
        int k = 2;
        double expected = 2;
        double rsl = SqArea.square(p, k);
        Assert.assertEquals(expected, rsl, 0.01);
    }

    @Test
    public void whenP16K7Then7() {
        int p = 16;
        int k = 7;
        double expected = 7;
        double rsl = SqArea.square(p, k);
        Assert.assertEquals(expected, rsl, 0.01);
    }
}