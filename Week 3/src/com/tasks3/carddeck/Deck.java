package com.tasks3.carddeck;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by Женя Кізім on 10.03.2017.
 */
public class Deck {
    public ArrayList<Card> deck_list = null;


    public Deck() {
        deck_list = new ArrayList<>();
        for (int i = 0; i<Suit.values.length; i++) {
            for (int j=0; j<Rank.values.length; j++) {
                deck_list.add(new Card(Rank.values[j], Suit.values[i]));
            }
        }
    }

    //Перемішує колоду у випадковому порядку
    public void shuffle() {
        ArrayList<Card> temp_deck_list = new ArrayList<>();
        while (this.deck_list.size()!=0) {
            int random_number = ThreadLocalRandom.current().nextInt(0, this.deck_list.size());
            temp_deck_list.add(this.deck_list.get(random_number));
            this.deck_list.remove(random_number);
        }
        this.deck_list = temp_deck_list;
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
        ArrayList<Card> temp_deck_list = new ArrayList<>();
        for (int i=0; i<Suit.values.length; i++) {
            for (int j=0; j<Rank.values.length; j++) {
                Card temp_card = new Card(Rank.values[j], Suit.values[i]);
                for (int k=0; k<this.deck_list.size(); k++) {
                    if ((this.deck_list.get(k).getSuit().getName().equals(temp_card.getSuit().getName())) && (
                            this.deck_list.get(k).getRank().getName().equals(temp_card.getRank().getName()))) {
                        temp_deck_list.add(temp_card);
                    }
                }
                /*if (this.deck_list.contains(temp_card)) {
                    temp_deck_list.add(temp_card);
                }*/
            }
        }
        this.deck_list = temp_deck_list;
    }

    //Повертає true у випадку коли в колоді ще доступні карти
    public boolean hasNext() {
        if (this.deck_list.size() < 1)
            return false;
        else
            return true;
    }

    //"Виймає" одну карту з колоди, коли буде видано всі 36 карт повертає null
    //Карти виймаються з "вершини" колоди. Наприклад перший виклик видасть SPADES 6 потім
    //SPADES 7, ..., CLUBS 6, ..., CLUBS Ace і так далі до HEARTS Ace
    public Card drawOne() {
        Card temp_card;
        if (this.hasNext()) {
            temp_card = this.deck_list.get(this.deck_list.size()-1);
            this.deck_list.remove(this.deck_list.size()-1);
            return temp_card;
        }
        else
            return null;
    }
}
