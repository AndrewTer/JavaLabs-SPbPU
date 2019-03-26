package lab8;

/**
 *
 * @author terehin.andrey
 * 
 * Задание (Парные буквы):
 * Надо реализовать метод, который принимает на вход String, удаляет рядом стоящие парные буквы и возвращает остаток. 
 * Примеры ожидаемого поведения программы:
 * "aab" -> "b", "aabb" -> "", "abfbaf" -> "abfbaf”, "abccbaf" -> "f"
 * Реализовать метод и описать его алгоритмическую сложность. Напишите junit-тесты.
 * 
 */

public class Lab8 
{
    public static String removePairedLetters(String str) {
        String pairedLetters = findPairedLetters(str);

        if (pairedLetters.length() != 0) {
            return removePairedLetters((str.replace(pairedLetters, "")));
        }
        return str;
    }

    public static String findPairedLetters(String str) {
        final char[] chars = str.toCharArray();
        String res = "";

        for (int i = 0; i < chars.length - 1; i++) {
            if (chars[i] == chars[i+1]) {
                res = (chars[i] + "" + chars[i + 1]);
            }
        }
        return res;
    }
    
}
