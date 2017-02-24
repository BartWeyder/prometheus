package com.company;

/**
 * Created by Женя Кізім on 24.02.2017.
 */
public class ShellSort {
    public static void main (String args[]) {
        int[] array = {30, 2, 10, 4, 6};
        int length = array.length;

        int temp_sort_var, j, k;
        for (k = length/2; k > 0; k/=2) {
            for (int i = k; i<length; i++) {
                temp_sort_var = array[i];
                for (j = i; j>=k; j-=k) {
                    if(temp_sort_var<array[j-k])
                        array[j] = array[j-k];
                    else
                        break;
                }
                array[j] = temp_sort_var;
            }
        }

        for (int i = 0; i < length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
