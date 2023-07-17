package com.zolotyh.warmup;

public class ArraySort {
    /*
     * a массив
     * p начальный индекс сортировки
     * r конечный индекс сортировки
     * q средний элеменнт массива
     */

    public static void main(String[] args) {
        sort(new int[]{5,2,4,6,1}, 0, 4);
    }

    public static void sort(int[] array, int start, int end) {
        if (start < end) {
            int half = (start + end) / 2;
            sort(array, start, half);
            sort(array, half + 1, end);
            merge(array, start, half, end);
        }
    }

    public static void merge(int[] array, int start, int half, int end) {

    }

    //5 2 4 6 1     (0+5) / 2 = 2
    //5 2 4         (0+2) / 2 = 1                     6 1
    //5 2           (0+1) / 2 = 0                     4
}
