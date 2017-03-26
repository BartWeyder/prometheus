package com.tasks5.command;

/**
 * Created by Женя Кізім on 26.03.2017.
 */
public class Application {
    public static void main(String[] args){
        //YOUR CODE COMES HERE
        Command command;
        if (args == null || args.length == 0 || args.length > 2) {
            command = new Error();
            command.execute();
        }
        else {
            switch (args[0]) {
                case "echo":
                    if (args.length != 2 || args[1] == null){
                        command = new Error();
                        command.execute();
                    }
                    else {
                        command = new EchoText(args[1]);
                        command.execute();
                    }
                    break;
                case "exit":
                    if (args.length != 1){
                        command = new Error();
                        command.execute();
                    }
                    else {
                        command = new Exit();
                        command.execute();
                    }
                    break;
                case "help":
                    if (args.length != 1){
                        command = new Error();
                        command.execute();
                    }
                    else {
                        command = new Help();
                        command.execute();
                    }
                    break;
                case "date":
                    if (args.length!=2 || args[1] == null || !args[1].equals("now")) {
                        command = new Error();
                        command.execute();
                    }
                    else {
                        command = new DateNow();
                        command.execute();
                    }
                    break;
                default:
                    command = new Error();
                    command.execute();
                    break;
            }
        }

    }
}
