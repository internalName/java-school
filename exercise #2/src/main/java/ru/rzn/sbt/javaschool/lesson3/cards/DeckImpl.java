package ru.rzn.sbt.javaschool.lesson3.cards;

import java.util.Random;

/* 11. В классе DeckImpl создайте public метод получения произвольной карты из колоды getCard(int suit, int rank).
        */
public class DeckImpl implements Deck {
    private CardImpl[][] cards;

    public DeckImpl(){
        cards=new CardImpl[4][9];

        for (int i=0;i<cards.length;i++){
            for (int k=0;k<cards[i].length;k++){
                cards[i][k]=new CardImpl(i,k);
            }
        }
    }

    public CardImpl getCard(int suit, int rank){
        return new CardImpl(suit,rank);
    }
}
