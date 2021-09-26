package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SwitchArrayTest {

    @Test
    public void whenSwap0ToInputLengthMinus1() {
        int[] input = {1, 2, 3, 4, 5, 6};
        int source = 0;
        int dest = input.length - 1;
        int[] rsl = SwitchArray.swap(input, source, dest);
        int[] expected = {6, 2, 3, 4, 5, 1};
        Assert.assertArrayEquals(expected, rsl);
    }

    @Test
    public void whenSwap1ToInputLengthMinus2() {
        int[] input = {1, 2, 3, 4, 5, 6};
        int source = 1;
        int dest = input.length - 2;
        int[] rsl = SwitchArray.swap(input, source, dest);
        int[] expected = {1, 5, 3, 4, 2, 6};
        Assert.assertArrayEquals(expected, rsl);
    }

    @Test
    public void whenSwap2InputLengthMinus3() {
        int[] input = {1, 2, 3, 4, 5, 6};
        int source = 2;
        int dest = input.length - 3;
        int[] rsl = SwitchArray.swap(input, source, dest);
        int[] expected = {1, 2, 4, 3, 5, 6};
        Assert.assertArrayEquals(expected, rsl);
    }
}