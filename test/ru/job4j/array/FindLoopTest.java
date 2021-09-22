package ru.job4j.array;

import org.junit.Test;
import static org.junit.Assert.*;
import static ru.job4j.array.FindLoop.indexOf;

public class FindLoopTest {

    @Test
    public void whenArraysHas5Then0() {
        int[] data = {5, 4, 3, 2};
        int el = 5;
        int result = indexOf(data, el);
        int expected = 0;
        assertEquals(expected, result);
    }

    @Test
    public void whenArrayHasNoElThenMinus1() {
        int[] data = {4, 3, 2, 1};
        int el = 5;
        int result = indexOf(data, el);
        int expexted = -1;
        assertEquals(expexted, result);
    }
}