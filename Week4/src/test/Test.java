package test;

/**
 * Created by Женя Кізім on 12.03.2017.
 */
enum Seasons
{
    SPRING, WINTER;

    private Seasons()
    {
        System.out.println("ok");
    }
}

public class Test
{
    public static void main(String[] args)
    {
        int j = new OuterClass.InnerClass().i;
    }
}