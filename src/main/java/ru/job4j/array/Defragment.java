package ru.job4j.array;

public class Defragment {
    public static void swap(String[] array, int dest, int source) {
        String tmp = array[dest];
        array[dest] = array[source];
        array[source] = tmp;
    }

    public static String[] compress(String[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                for (int j = i + 1; j < array.length; j++) {
                    if (array[j] != null) {
                        swap(array, i, j);
                        break;
                    }
                }
            }
            System.out.print(array[i] + " ");
        }
        return array;
    }
}
