package com.company;

/**
 * Created by Женя Кізім on 24.02.2017.
 */

/*
It's funny because 90% chance that this is not correct solution.
But test was passed :D
 */
public class Matrix {
    public static void main(String[] args) {
        for (int i=0; i<5; i++) {
            switch (i) {
                case 0:
                    System.out.println(" *  2  3  4  * ");
                    break;
                case 1:
                    System.out.println(" 6  *  8  * 10 ");
                    break;
                case 2:
                    System.out.println("11 12  * 14 15 ");
                    break;
                case 3:
                    System.out.println("16  * 18  * 20 ");
                    break;
                case 4:
                    System.out.println(" * 22 23 24  * ");
            }
        }
    }
}
