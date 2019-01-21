package ru.rzn.sbt.javaschool.lesson3.hobby;

public class Solution {
    /**
     * Хобби
     * <p>
     * Реализуйте метод detect таким образом, чтобы определить из входного массива students количество
     * студентов, занимающихся музыкой {@link Rockstar}, студентов, увлекающихся мотоциклами {@link Biker} и студентов
     * без хобби {@link Student} (такие студенты не должны быть ни {@link Rockstar}, ни {@link Biker}), и разместите
     * результат в виде объекта класса {@link DetectionResult} с заполненными соответствующими полями.
     * Случаи с null-ссылкой на массив и null-элементами массива следует обрабатывать.
     */
    public static DetectionResult detect(Object[] students) {
        if (students == null) return new DetectionResult();

        int countPure = 0;
        int countRockstar = 0;
        int countBiker = 0;

        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                if (students[i].getClass() == Rockstar.class) countRockstar++;
                else if (students[i].getClass() == Biker.class) countBiker++;
                else if (students[i].getClass() == Student.class) countPure++;
            }
        }
        return new DetectionResult(countPure, countRockstar, countBiker);
    }
}
