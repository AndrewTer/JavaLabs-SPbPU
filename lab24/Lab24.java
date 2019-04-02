package lab24.speed;

/**
 *
 * @author terehin.andrey
 * 
 * Задание (Скорость):
 * Напишите функцию, на входе которой расстояние до места назначения (S, м) и время в пути (T, мин). Вычислить скорость (км/ч). Напишите тесты.
 * 
 */

public class Lab24Speed {

    public static double speedFunc(double s, double t)
    {
        return (s/1000.0)/(t/60.0);
    }
    
    public static void main(String[] args) {
        
    }
    
}
