package lab5.minlist;

import java.util.List;

/**
 *
 * @author terehin.andrey
 * 
 * Задание(Мин лист):
 * Напишите обобщенный метод для поиска минимального элемента списка в диапазоне [begin, end). 
 * Где [ – включительно, ) – исключительно. Напишите junit-тесты.
 * @param <T>
 * 
 */

public class Lab5MinList<T extends Comparable<T>> {

    public T minElementListInRange(int begin, int end, List<T> list) {
        if (end < begin || begin < 0 || end > list.size()) {
            throw new IllegalArgumentException();
        } 
        else {

            T minelement = list.get(begin);

            for (int i = begin + 1; i < end; i++) {
                
                if (list.get(i).compareTo(minelement) < 0) {
                    minelement = list.get(i);
                }
            }

            return minelement;
        }
    }
    
}
