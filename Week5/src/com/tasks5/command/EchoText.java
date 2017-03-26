package com.tasks5.command;

/**
 * Created by Женя Кізім on 26.03.2017.
 */
public class EchoText implements Command{
    private String text;

    public EchoText (String text) {
        this.text = text;
    }

    public void execute() {
        System.out.println(this.text);
    }
}
