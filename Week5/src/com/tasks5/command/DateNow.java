package com.tasks5.command;

/**
 * Created by Женя Кізім on 26.03.2017.
 */
public class DateNow implements Command{
    public void execute() {
        System.out.println(System.currentTimeMillis());
    }
}
