package com.demo;

/**
 * Created by Женя Кізім on 25.03.2017.
 */
public class Demo extends Parent {
    public void demoPrint() {
        System.out.println("Demo print void demo print");
    }

    public void print(){
        System.out.println("Child print");
    }

    public static void staticPrint(){
        System.out.println("Child static print");
    }
}
