package ru.rzn.sbt.javaschool.lesson3.cards;

public class CardImpl implements Card {
    private int suit;

    private enum SuitName {бубны, трефы, червы, пики}

    private int rank;

    private enum RankName {туз, шестёрка, семёрка, восьмёрка, девятка, десятка, валет, дама, король}

    public CardImpl(int suit, int rank) {
        this.suit = suit;
        this.rank = rank;
    }

    @Override
    public String toString() {

        return RankName.values()[rank].toString()+" "+SuitName.values()[suit];
    }
}
