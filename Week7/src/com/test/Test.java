package com.test;

/**
 * Created by Admin on 08-Apr-17.
 */
class Test {
    public static int test(){
        try {
            return 1;
        } catch (RuntimeException re){
            return 2;
        } finally {
            return 3;
        }
    }
}


