package com.demo;

/**
 * Created by Женя Кізім on 26.03.2017.
 */
public class Sort {
    public static void main(String args[]){
        Comparable[] array = new Comparable[3];
        array[0] = new MyInteger(20);
        array[1] = new MyInteger(5);
        array[2] = new MyInteger(45);
        Sort.sort(array);
        System.out.println("Done");
    }

    static void sort(Comparable[] arr){
        for (int i = 0; i < arr.length - 1; i++){
            boolean swapped = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j].isGreater(arr[j+1])) {
                    Comparable tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                    swapped = true;
                }
            }

            if (!swapped)
                break;
        }
    }
}
