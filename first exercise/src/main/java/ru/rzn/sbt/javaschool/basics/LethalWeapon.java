package ru.rzn.sbt.javaschool.basics;
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
     private static long nextSerial=0;
     private final long serial=nextSerial;

     public LethalWeapon(){
         nextSerial++;
     }

     public LethalWeapon(String color, Double power,int roundsLeft){

     }

     public long getSerial(){
         return serial;
     }

     public void setPower(Double power){
         this.power=power;
     }

     public Double getPower(){
         return power;
     }

     public void Reload(int num){
         roundsLeft+=num;
     }

     public void PewPew(){
         roundsLeft-=2;
     }
}
