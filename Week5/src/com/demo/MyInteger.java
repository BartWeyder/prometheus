package com.demo;

/**
 * Created by Женя Кізім on 26.03.2017.
 */
public class MyInteger implements Comparable {
    private int value;

    public MyInteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public boolean isGreater(Object x) {
        MyInteger integer = (MyInteger) x;
        if (integer.getValue() > value)
            return true;
        else
            return false;    }

    @Override
    public boolean isLess(Object x) {
        MyInteger integer = (MyInteger) x;
        if (integer.getValue() < value)
            return true;
        else
            return false;    }

    @Override
    public boolean isEqual(Object x) {
        MyInteger integer = (MyInteger) x;
        if (integer.getValue() == value)
            return true;
        else
            return false;
    }
}
