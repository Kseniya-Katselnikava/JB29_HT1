//Дана сторона равностороннего треугольника. Найти площадь этого треугольника, его
//высоту, радиусы вписанной и описанной окружностей.
package by.epam.jb29.task01;
import java.util.Scanner;

public class Z19 {
    public static void main(String[] args) {
        double a, S, h, r, R;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите длину равностороннего треугольника: ");
        a = sc.nextDouble();
        S = Math.sqrt(3) / 4 * Math.pow(a, 2);
        h = Math.sqrt(3) / 2 * a;
        r = Math.sqrt(3) / 6 * a;
        R = Math.sqrt(3) / 3 * a;
        System.out.printf("Площадь равностороннего треугольника равна: %.2f " +
                "\nВысота равностороннего треугольника равна: %.2f" +
                "\nРадиус вписанной окружности равностороннего треугольника равен: %.2f" +
                "\nРадиус описанной окружности равностороннего треугольника равен: %.2f", S, h, r, R);
    }
}
