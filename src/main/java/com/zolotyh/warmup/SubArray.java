package com.zolotyh.warmup;

import java.util.ArrayList;
import java.util.Comparator;

public class SubArray {
    public static void main(String[] args) {
        SubArray subArray = new SubArray();
        subArray.checkSortArrayLength(new int[]{2,1,4,1,2,3,4,5,6,7,3,1});
    }

    void checkSortArrayLength(int[] array){
        ArrayList<Integer> sequenceLength = new ArrayList<>();
        int count = 1;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] <= array[i+1]) {
                count++;
            } else {
                sequenceLength.add(count);
                count = 1;
            }
        }
        sequenceLength.add(count);
        int maxLength = sequenceLength.stream().max(Comparator.naturalOrder()).get();
        System.out.println(maxLength);
    }
}
