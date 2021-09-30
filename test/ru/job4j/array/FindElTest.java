package ru.job4j.array;

import org.junit.Test;
import org.junit.Assert;

public class FindElTest {

    @Test
    public void whenArrayHasLength5Then0() {
        int[] data = {5, 10, 3};
        int el = 5;
        int start = 2;
        int finish = 4;
        int rsl = FindEl.indexOf(data, el, start, finish);
        int expected = 0;
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void whenFind3() {
        int[] data = new int[] {5, 2, 10, 2, 4};
        int el = 2;
        int start = 2;
        int finish = 4;
        int result = FindEl.indexOf(data, el, start, finish);
        int expected = 3;
        Assert.assertEquals(expected, result);
    }
}