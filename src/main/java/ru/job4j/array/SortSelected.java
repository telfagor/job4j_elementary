package ru.job4j.array;

public class SortSelected {
    public static void swap(int[] array, int min, int index, int i) {
        int tmp = array[i];
        array[i] = min;
        array[index] = tmp;
    }

    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            int min = MinDiapason.findMin(data, i, data.length);
            int index = FindEl.indexOf(data, min, i, data.length);
            SwitchArray.swap(data, index, i);
        }
        return data;
    }
}
