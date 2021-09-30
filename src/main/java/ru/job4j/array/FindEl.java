package ru.job4j.array;

public class FindEl {
    public static int indexOf(int[] data, int el, int start, int finish) {
        int rst = -1;
        if ((start >= 0 && start < data.length) && (finish >= start && finish < data.length)) {
            for (int i = start; i <= finish; i++) {
                if (data[i] == el) {
                    rst = i;
                    break;
                }
            }
        }
        return rst;
    }
}
