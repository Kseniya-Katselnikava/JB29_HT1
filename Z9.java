//Вычислить значение выражения по формуле (все переменные принимают
//действительные значения):
package by.epam.jb29.task01;
import java.util.Scanner;

public class Z9 {
    public static void main(String[] args) {
        double a, b, c, d, result;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите значение a: ");
        a = sc.nextDouble();
        System.out.println("Введите значение b: ");
        b = sc.nextDouble();
        System.out.println("Введите значение c: ");
        c = sc.nextDouble();
        System.out.println("Введите значение d: ");
        d = sc.nextDouble();
        if (c > 0 && d > 0) {
        result = (a / c) * (b / d) - (a * b - c) / (c * d);
       System.out.printf("Результат выражения равен: %.3f", result);
        }
        else {
            System.out.println("с или d равно нулю. Делить на ноль нельзя!");
        }
    }
}
