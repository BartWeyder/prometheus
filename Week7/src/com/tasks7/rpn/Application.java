/**
 * A lot of kostyls, but I'm falling a sleep.
 * Created by Eugenij Kizim.
 */

package com.tasks7.rpn;

import java.util.Deque;
import java.util.LinkedList;

public class Application {

    public static double parse(String rpnString) throws RPNParserException{
        Deque<String> deque = new LinkedList();
        StringBuilder string = new StringBuilder();
        double result;
        char[] input = rpnString.toCharArray();
        if (rpnString.contains("NaN"))
            throw new ArithmeticException();
        for (int i = 0; i < input.length; i++) {
            if (Character.isDigit(input[i])) {
                string.append(input[i]);
            }
            else {
                switch (input[i]) {
                    case ' ':
                        if (string.length()>0)
                                deque.addFirst(string.toString());
                            string.setLength(0);

                        break;
                    case '.':
                        if (string.length() > 0)
                            string.append(input[i]);
                        else
                            throw new RPNParserException();
                        break;
                    case '*':
                        if (deque.size()>=2)
                            deque.addFirst(String.valueOf(multiply(Double.parseDouble(deque.removeFirst()),
                                    Double.parseDouble(deque.removeFirst()))));
                        else
                            throw new RPNParserException();
                        break;
                    case '/':
                        if (deque.size()>=2)
                            deque.addFirst(String.valueOf(divide(Double.parseDouble(deque.removeFirst()),
                                    Double.parseDouble(deque.removeFirst()))));
                        else
                            throw new RPNParserException();
                        break;
                    case '+':
                        if (deque.size()>=2)
                            deque.addFirst(String.valueOf(add(Double.parseDouble(deque.removeFirst()),
                                    Double.parseDouble(deque.removeFirst()))));
                        else
                            throw new RPNParserException();
                        break;
                    case '-':
                        //if (deque.size()>=2)
                        if ((i == input.length - 1 || input[i+1] == ' ')&&(deque.size()>=2))
                        deque.addFirst(String.valueOf(subtract(Double.parseDouble(deque.removeFirst()),
                                Double.parseDouble(deque.removeFirst()))));
                        else if (Character.isDigit(input[i+1]))
                            string.append(input[i]);
                        else
                            throw new RPNParserException();
                        break;
                    default:
                        throw new RPNParserException();
                }
            }
        }
        if (deque.size() == 1)
            return Double.parseDouble(deque.removeFirst());
        else
            throw new RPNParserException();
    }

    private static double multiply (double first, double second) {
        return first*second;
    }

    private static double divide (double first, double second) throws ArithmeticException {
        if (first == 0)
            throw new ArithmeticException();
        else
            return second / first;
    }

    private static double add (double first, double second) {
        return first + second;
    }

    private static double subtract (double first, double second) {
        return second - first;
    }

    public static void main(String[] args) {
        System.out.print(parse("12 2 3 4 * 10 5 / + * +"));
    }

}
