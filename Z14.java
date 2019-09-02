//Вычислить длину окружности и площадь круга одного и того же заданного радиуса R.
package by.epam.jb29.task01;
import java.util.Scanner;
import static java.lang.Math.PI;

public class Z14 {
    public static void main(String[] args) {
        double r, C, A;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите радиус");
        while (!sc.hasNextDouble()) {
            sc.next();
        }
        r = sc.nextDouble();
        if (r > 0) {
            C = 2 * PI * r;
            A = PI * r * r;
//            System.out.println("Длина окружности равна: " + C
//                                + "\nПлощадь круга равна: " + A);
            System.out.printf("Длина окружности равна: %.2f Площадь круга равна:  %.2f ", C, A);
        }
        else {
            System.out.println("Ошибка. Радиус не может быть отрицательным числом и нулем!");
        }
    }
}
