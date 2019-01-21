package ru.rzn.sbt.javaschool.lesson3.musician;

public class Vocalist extends Musician {
    private int counterSong = 0;

    private String[] songText = new String[]{ "Take me to the magic of the moment","on a glory night", "Where the children of tomorrow dream away", "In the Wind of Change"};


    @Override
    protected String playGuitar() {
        return null;
    }

    @Override
    protected String sing() {
        if (counterSong >= songText.length) counterSong = 0;

        return songText[counterSong++];
    }
}
