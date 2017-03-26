package com.demo;

/**
 * Created by Женя Кізім on 26.03.2017.
 */
public class Demo2 {
    public static void main(String[] args)
    {
        int result = new Calculator()
        {
            int sum(int a, int b)
            {
                return a+b;
            }
        }.sum(2, 3);
        System.out.println(result);
    }
}
