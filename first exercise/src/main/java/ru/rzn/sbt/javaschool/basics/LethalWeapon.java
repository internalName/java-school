package ru.rzn.sbt.javaschool.basics;

import java.util.Objects;

/**
 * Добавьте в класс LethalWeapon серийные номера.<br />
 * <br />
 * Создайте приватное статическое целочисленное ({@code long}) поле nextSerial = 0.<br />
 * Создайте приватное финальное целочисленное ({@code long}) поле serial с методом чтения.<br />
 * В конструкторах обеспечьте корректное проставление серийных номеров.<br />
 */

public class LethalWeapon {
    public String color;
    private int roundsLeft;
    private Double power;
    private static long nextSerial = 0;
    private final long serial = nextSerial;

    public LethalWeapon() {
        nextSerial++;
    }

    public LethalWeapon(String color, Double power, int roundsLeft) {
        nextSerial++;
        this.color = color;
        this.power = power;
        this.roundsLeft = roundsLeft;
    }

    public long getSerial() {
        return serial;
    }

    public void setPower(Double power) {
        this.power = power;
    }

    public Double getPower() {
        return power;
    }

    public void reload(int num) {
        roundsLeft += num;
    }

    public void pewPew() {
        roundsLeft -= 2;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            LethalWeapon lw=(LethalWeapon)obj;
            return Objects.equals(this.color,lw.color)&&
                    Objects.equals(this.power,lw.power)&&
                    roundsLeft==lw.roundsLeft;

        }

        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(color,power,roundsLeft);
    }
}
