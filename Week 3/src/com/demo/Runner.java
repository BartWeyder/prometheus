package com.demo;

/**
 * Created by Женя Кізім on 04.03.2017.
 */
public class Runner {
    public static void main(String[] args)
    {
        Test obj1 = new Test();
        Test obj2 = obj1;

        obj1.a += 1;
        obj1.b += 1;

        obj2.a += 1;
        obj2.b += 1;

        System.out.println("Obj1: a:"+obj1.a+" b:"+obj1.b);
        System.out.println("Obj2: a:"+obj2.a+" b:"+obj2.b);

    }
}
