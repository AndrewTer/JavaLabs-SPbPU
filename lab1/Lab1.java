package lab1;

import java.util.Arrays;

/**
 *
 * @author terehin.andrey
 * 
 * Задание:
 * Реализуйте метод boolean swap(int i, int j, int[] anArray), меняющий местами элементы
 * по индексам i и j в массиве anArray и возвращающий false, если индексы выходят за
 * пределы массива
 */

public class Lab1 
{
    public static boolean swap(int i, int j, int[] anArray) 
    {
        int maxIndex = anArray.length - 1;

        if ((i < 0) || (j < 0) || (i > maxIndex) || (j > maxIndex)) 
        {
            return false;
        } 
        else 
        {
            int tmp = anArray[i];
            anArray[i] = anArray[j];
            anArray[j] = tmp;
            
            //System.out.println("После: "+Arrays.toString(anArray));
            return true;
        }
    }
    
}
