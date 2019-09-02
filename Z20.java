//Известна длина окружности. Найти площадь круга, ограниченного этой окружностью.
package by.epam.jb29.task01;
import java.util.Scanner;
import static java.lang.Math.PI;

public class Z20 {
    public static void main(String[] args) {
        double C, r, S;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите длину окружности: ");
        C = sc.nextDouble();
        r = C / (2 * PI);
        S = PI * Math.pow(r, 2);
        System.out.printf("Площадь круга равна: %.2f ", S);
    }
}
