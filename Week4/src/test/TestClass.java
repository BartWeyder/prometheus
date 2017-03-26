package test;

/**
 * Created by Женя Кізім on 12.03.2017.
 */
enum Demo
{
    DEMO;

    int i = 10;

    {
        i--;
    }

    {
        --i;
    }

    private Demo()
    {
        i = i-- + --i;
    }
}

public class TestClass
{
    public static void main(String[] args)
    {
        System.out.println(Demo.DEMO.i);
    }
}