package lab4.swapinlist;

import java.util.*;

/**
 *
 * @author terehin.andrey
 * 
 * Задание (Свап):
 * Напишите обобщенный метод для перестановки двух элементов в списке по индексам. Напишите junit-тесты.
 * @param <T>
 * 
 */

public class Lab4SwapInList<T> 
{

    public List<T> swap(int i, int j, List<T> list) {
        List<T> resultList = list;

        T tmp = resultList.get(i);
        resultList.set(i, resultList.get(j));
        resultList.set(j, tmp);

        return resultList;
    }
}
