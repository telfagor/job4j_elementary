package ru.job4j.array;

import org.junit.Test;
import org.junit.Assert;

public class SortSelectedTest {

    @Test
    public void whenSortArrayWithLength5() {
        int[] data = {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = {1, 2, 3, 4, 5};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSortArrayWithLength3() {
        int[] data = {3, 2, 1};
        int[] result = SortSelected.sort(data);
        int[] expected = {1, 2, 3};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSortArrayWithLength7() {
        int[] data = {-2, 0, 7, 100, 43, -6, 1000};
        int[] result = SortSelected.sort(data);
        int[] expected = {-6, -2, 0, 7, 43, 100, 1000};
        Assert.assertArrayEquals(expected, result);
    }

}