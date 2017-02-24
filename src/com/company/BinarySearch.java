package com.company;

/**
 * Created by Женя Кізім on 24.02.2017.
 */
public class BinarySearch {
    public static void main (String args[]) {
        int data[] = { 14, 15, 23, 36, 38, 42, 59, 61, 69, 91 };
        int numberToFind = 69;

        int left_part = 0;
        int right_part = data.length-1;
        int found_number;
        while (left_part<=right_part) {
            found_number = (left_part + right_part)/2;
            if (data[found_number] == numberToFind) {
                System.out.println(found_number);
                return;
            }
            else {
                if (data[found_number]>numberToFind)
                    right_part = found_number - 1;
                else
                    left_part = found_number + 1;
            }
        }
        System.out.println(-1);
        return;
    }
}
