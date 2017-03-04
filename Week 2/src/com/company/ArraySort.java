package com.company;

/**
 * Created by Женя Кізім on 24.02.2017.
 */
public class ArraySort {
    public static void main(String args[]) {
        int[] array = {30, 2, 10, 4, 6};
        int length = array.length;

        int sort_temp_var;
        boolean is_sorted;
        for (int j = 0; j<length-1; j++) {
            is_sorted = true;
            for (int i = 0; i < length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    sort_temp_var = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = sort_temp_var;
                    is_sorted = false;
                }
            }
            if (is_sorted == true)
                break;
        }

        for (int i = 0; i < length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
