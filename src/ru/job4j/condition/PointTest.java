package ru.job4j.condition;

import org.junit.Test;

import org.junit.Assert;

public class PointTest {

    @Test
    public void when00to20then2() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double expected = 2;
        double rsl = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, rsl, 0.01);
    }

    @Test
    public void when51To11Then4() {
        int x1 = 5;
        int y1 = 1;
        int x2 = 1;
        int y2 = 1;
        double expected = 4;
        double rsl = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, rsl, 0.01);
    }

    @Test
    public void when16To11Then5() {
        int x1 = 1;
        int y1 = 6;
        int x2 = 1;
        int y2 = 1;
        double expected = 5;
        double rsl = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, rsl, 0.01);
    }

    @Test
    public void when11To71Then6() {
        int x1 = 1;
        int y1 = 1;
        int x2 = 7;
        int y2 = 1;
        double expected = 6;
        double rsl = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, rsl, 0.01);
    }

    @Test
    public void when11To18Then7() {
        int x1 = 1;
        int y1 = 1;
        int x2 = 1;
        int y2 = 8;
        double expected = 7;
        double rsl = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, rsl, 0.01);
    }
}