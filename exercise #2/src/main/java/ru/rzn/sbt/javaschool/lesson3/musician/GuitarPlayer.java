package ru.rzn.sbt.javaschool.lesson3.musician;

public class GuitarPlayer extends Musician {
    private int counterPlayerGuitar=0;

    private static final String[] guitarText = new String[]{"C G Dm G","C G","Dm G Am","Am/F G"};

    @Override
    protected String playGuitar() {
        if (counterPlayerGuitar >= guitarText.length) counterPlayerGuitar = 0;

        return guitarText[counterPlayerGuitar++];
    }

    @Override
    protected String sing() {
        return null;
    }
}
