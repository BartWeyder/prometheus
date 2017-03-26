package com.tasks6.rle;

/**
 * Created by Женя Кізім on 26.03.2017.
 */
public class Application {
    public static void main( String[] args )
    {
        if (args[0].length() == 0)
            System.out.println("");
        else {
            char[] temp_string = args[0].toCharArray();
            int j = 1;
            StringBuilder string = new StringBuilder();
            for (int i = 0; i < temp_string.length; i++) {
                if (i == temp_string.length-1) {
                    if (temp_string[i] == temp_string[i-1]) {
                        string.append(temp_string[i]);
                        string.append(j);
                        break;
                    }
                    else {
                        string.append(temp_string[i]);
                        break;
                    }
                }
                if (temp_string[i] == temp_string[i+1]) {
                    j++;
                }
                else {
                    if (j > 1) {
                        if (j <= 9) {
                            string.append(temp_string[i]);
                            string.append(j);
                            j = 1;
                        }
                        else{
                            while (j>9) {
                                string.append(temp_string[i]);
                                string.append(9);
                                j -= 9;
                            }
                            string.append(temp_string[i]);
                            string.append(j);
                            j = 1;
                        }
                    }
                    else
                        string.append(temp_string[i]);
                }
            }
            System.out.println(string);
        }
    }
}
