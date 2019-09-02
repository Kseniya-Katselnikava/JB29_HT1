//Вычислить значение выражения по формуле (все переменные принимают
//действительные значения):
//𝑠𝑖𝑛 𝑥 + 𝑐𝑜𝑠 𝑦
//𝑐𝑜𝑠 𝑥 − 𝑠𝑖𝑛 𝑦
//∗ 𝑡𝑔 𝑥𝑦
package by.epam.jb29.task01;
import java.util.Scanner;
import static java.lang.Math.*;

public class Z10 {
    public static void main(String[] args) {
        double x, y, res;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите значение x: ");
        x = sc.nextDouble();
        System.out.println("Введите значение y: ");
        y = sc.nextDouble();
        res = (sin(toRadians(x)) + cos(toRadians(y))) / (cos(toRadians(x)) - sin(toRadians(y))) * tan(toRadians(x*y));
        System.out.printf("Результат выражения равен: %.2f", res);
      }
}
