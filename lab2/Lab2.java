package lab2;

import java.util.*;

/**
 *
 * @author terehin.andrey
 * 
 * Задание (Min 3):
 * Реализуйте метод int min(int a, int b, int c), находящий минимальный из трёх аргументов
 */
public class Lab2 {

    public static int min(int a, int b, int c) {
        return Collections.min(Arrays.asList(a, b, c));
    }
    
}
