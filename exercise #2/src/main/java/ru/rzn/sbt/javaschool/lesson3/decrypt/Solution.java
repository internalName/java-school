package ru.rzn.sbt.javaschool.lesson3.decrypt;

public class Solution {
    /**
     * Дешфрование строки
     * <p>
     * Реализуйте метод decrypt, осуществляющий расшифровку сроки encrypted с использованием {@link StringBuilder}.
     * <p>
     * Входящая строка зашифрована следующим образом:
     * а) Зашифрованы только символы латинского алфавита, прочие следует оставлять в исходном виде
     * б) Каждый символ зашифрован ASCII кодом со смещением 9, например 'a' -> 'j'
     * в) После символа 'z' шифрование осуществляется циклически, независимо от регистра символа, например,
     * 'x' -> 'g', 'V' -> 'E'
     * <p>
     * Не забудте проверку на null.
     */
    public static String decrypt(String encrypted) {
        StringBuilder stringBuilder = new StringBuilder();
        if (encrypted == null) return null;
        for (int i = 0; i < encrypted.length(); i++) {
            if (((encrypted.charAt(i) >= 'a') &&
                    (encrypted.charAt(i) <= 'z')) ||
                    ((encrypted.charAt(i) >= 'A') &&
                            (encrypted.charAt(i) <= 'Z'))) {

                int shift = (int) encrypted.charAt(i) - 9;
                if (shift > 87 && shift < 123) {

                    if (shift < 97) stringBuilder.append(((char) (122 - (96 - shift))));
                    else stringBuilder.append(((char) shift));
                } else if (shift > 55 && shift < 91) {
                    if (shift < 65) stringBuilder.append(((char) (90 - (64 - shift))));
                    else stringBuilder.append(((char) shift));
                }
            } else {
                stringBuilder.append(encrypted.charAt(i));
            }
        }

        return stringBuilder.toString();
    }
}
