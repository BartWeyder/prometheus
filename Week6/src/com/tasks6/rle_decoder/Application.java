package com.tasks6.rle_decoder;

/**
 * Created by Женя Кізім on 26.03.2017.
 */
public class Application {

    public static void main( String[] args )
    {
        Application demo = new Application();
        System.out.println(demo.decode(args[0]));
    }

    private boolean valid (char[] array) {
        if (Character.isDigit(array[0]))
            return false;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == array[i+1])
                return false;
            else {
                if (Character.isDigit(array[i]) && Character.isDigit(array[i+1]))
                    return false;
            }
        }
        return true;
    }

     private StringBuilder decode (String input) {
        StringBuilder string = new StringBuilder();
        char[] array = input.toCharArray();
        if (input.equals("") || !this.valid(array))
            System.out.println("");
        else {
            for (int i = 0; i < array.length - 1; i++) {
                if (Character.isDigit(array[i+1])) {
                    for (int j = 0; j < Character.getNumericValue(array[i+1]); j++)
                        string.append(array[i]);
                    i++;
                }
                else
                    string.append(array[i]);
            }
            if (!Character.isDigit(array[array.length - 1]))
                string.append(array[array.length-1]);
        }
        return string;
    }
}
