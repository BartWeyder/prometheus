package com.tasks3.carddeck;

import com.sun.deploy.util.ArrayUtil;

import java.lang.reflect.Array;

/**
 * Created by Женя Кізім on 10.03.2017.
 */
public class DeckTest {
    public static void main (String args[]) {
        DeckMassive test = new DeckMassive();
        Card test_card;
        test.shuffle();
        test.order();
        for (int i = 0; i<36; i++) {
            test_card = test.drawOne();
            System.out.println("Card "+(i+1)+": Suit: "+test_card.getSuit().getName() + " Rank: "+test_card.getRank().getName());
        }
    }
}
