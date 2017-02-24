package com.company;

public class Main {

    public static void main(String[] args) {
        double a = 1;
        double b = 1.1;
        double c = 0.1;

        double x1, x2;
        double disc = b*b - 4*a*c;


        if ((disc < 0)||((a == 0)&&(b == 0))) {
            System.out.println("x1=");
            System.out.println("x2=");
            return;
        }
        else {
            if (a == 0) {
                if (c!=0)
                    x1 = (-c)/b;
                else
                    x1 = 0;
                x2 = x1;
            }
            else {
                x1 = ((-b) + Math.sqrt(disc)) / (2 * a);
                if (disc == 0)
                    x2 = x1;
                else
                    x2 = ((-b) - Math.sqrt(disc)) / (2 * a);
            }
            System.out.print("x1=");
            System.out.println(x1);

            System.out.print("x2=");
            System.out.println(x2);
            return;

        }
    }
}
