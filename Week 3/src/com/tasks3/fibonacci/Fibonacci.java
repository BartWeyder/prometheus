package com.tasks3.fibonacci;

/**
 * Created by Женя Кізім on 11.03.2017.
 */
public class Fibonacci {
    public Fibonacci() {
    //oops
    }

    public long getNumber(int position){
        //PUT YOUR CODE HERE
        long number;

        if (position<1)
            return -1;
        else if ((position == 1)||(position == 2))
            return 1;
        else {
            number = this.getNumber(position-1) + this.getNumber(position-2);
            return number;
        }
        //PUT YOUR CODE HERE
    }
}
