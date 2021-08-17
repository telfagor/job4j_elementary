package ru.job4j.calculator;

import org.junit.Test;

import org.junit.Assert;

public class FitTest {

    @Test
    public void whenMan182Then92() {
        short height = 180;
        double expected = 92.0;
        double rsl = Fit.manWeight(height);
        Assert.assertEquals(expected, rsl, 0.01);
    }

    @Test
    public void whenWoman190Then92() {
        short height = 190;
        double expected = 92.0;
        double rsl = Fit.womanWeight(height);
        Assert.assertEquals(expected, rsl, 0.01);
    }
}