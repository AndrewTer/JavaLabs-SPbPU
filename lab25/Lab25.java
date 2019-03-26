package lab25.converselystring;

/**
 *
 * @author terehin.andrey
 * 
 * Задание (Строка наоборот):
 * Напишите программу, отображающую переданную строку задом наперёд. Напишите тесты.
 */

public class Lab25ConverselyString {

    public static String reverseString(String s) {
        StringBuilder revStr = new StringBuilder(s);
        String result = revStr.reverse().toString();
        System.out.println(s+" | "+result+"\n");
        return result;
    }
    
}
