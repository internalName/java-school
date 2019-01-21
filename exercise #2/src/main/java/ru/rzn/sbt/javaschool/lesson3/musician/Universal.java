package ru.rzn.sbt.javaschool.lesson3.musician;

public class Universal extends Musician {
    private int counterSong = 0;
    private int counterGuitarPlayer = 0;

    private String[] songText = new String[]{ "Take advantage while", "You hang me out to dry", "But I can't see you every night", "Free I do" };
    private String[] guitarText = new String[]{ "C# G# F#", "C# G# F#", "Em E A5 C", "Em G Em G"};

    @Override
    protected String playGuitar() {
        if (counterGuitarPlayer >= guitarText.length) counterGuitarPlayer = 0;

        return guitarText[counterGuitarPlayer++];
    }

    @Override
    protected String sing() {
        if (counterSong >= songText.length) counterSong = 0;

        return songText[counterSong++];
    }
}
