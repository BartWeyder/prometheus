package com.tasks3.carddeck;

import java.util.Random;

/**
 * Created by Женя Кізім on 11.03.2017.
 */
public class DeckMassive {

    private Card[] deck;
    private int amount;

    /*private boolean isBigger (Card one, Card two) {

    }*/

    public DeckMassive() {
        int k = 0;
        this.amount = 36;
        this.deck = new Card[36];
        for (int i = 0; i<Suit.values.length; i++) {
            for (int j=0; j<Rank.values.length; j++) {
                deck[k] = new Card(Rank.values[j], Suit.values[i]);
                k++;
            }
        }
    }

    //Перемішує колоду у випадковому порядку
    public void shuffle() {
        Card[] temp_deck = new Card[36];
        Random rand = new Random();
        int random_value;
        int temp_amount = this.amount;

        for (int i=0; i<temp_amount; i++) {
            random_value = rand.nextInt((this.amount));
            temp_deck[i] = this.deck[random_value];
            //this.deck[random_value] = this.deck[this.deck.length - i];
            this.massSwap(random_value, this.amount - 1);
            this.deck[this.amount - 1] = null;
            this.amount--;
        }
        this.deck = temp_deck;
        this.amount = temp_amount;
    }

    /* * Впорядкування колоди за мастями та значеннями
    * Порядок сотрування:
    * Спочатку всі карти з мастю HEARTS, потім DIAMONDS, CLUBS, SPADES
    * для кожної масті порядок наступний: Ace,King,Queen,Jack,10,9,8,7,6
    * Наприклад
    * HEARTS Ace
    * HEARTS King
    * HEARTS Queen
    * HEARTS Jack
    * HEARTS 10
    * HEARTS 9
    * HEARTS 8
    * HEARTS 7
    * HEARTS 6
    * І так далі для DIAMONDS, CLUBS, SPADES */
    public void order() {
        Card temp_card;
        Card[] temp_deck = new Card[36];
        int l = 0;

        for (int i = 0; i<Suit.values.length; i++) {
            for (int j=0; j<Rank.values.length; j++) {
                temp_card = new Card(Rank.values[j], Suit.values[i]);
                for (int k=0; k<this.amount; k++) {
                    if ((this.deck[k].getRank().getName().equals(temp_card.getRank().getName())) &&
                            (this.deck[k].getSuit().getName().equals(temp_card.getSuit().getName()))) {
                                temp_deck[l] = this.deck[k];
                                l++;
                                break;
                    }
                }
            }
        }

        this.deck = temp_deck;
    }

    //Повертає true у випадку коли в колоді ще доступні карти
    public boolean hasNext() {
        if (this.amount<1)
            return false;
        else
            return true;
    }

    //"Виймає" одну карту з колоди, коли буде видано всі 36 карт повертає null
    //Карти виймаються з "вершини" колоди. Наприклад перший виклик видасть SPADES 6 потім
    //SPADES 7, ..., CLUBS 6, ..., CLUBS Ace і так далі до HEARTS Ace
    public Card drawOne() {
        if (this.hasNext()) {
            Card picked_card;
            picked_card = this.deck[this.amount - 1];
            this.deck[amount - 1] = null;
            this.amount--;
            return picked_card;
        }
        else
            return null;
    }

    private void massSwap (int first, int second) {
        Card temp;
        temp = this.deck[first];
        this.deck[first] = this.deck[second];
        this.deck[second] = temp;
    }
}
