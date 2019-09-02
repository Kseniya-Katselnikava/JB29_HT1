//Вычислить расстояние между двумя точками с данными координатами (х1, у1)и (x2, у2).
package by.epam.jb29.task01;
import java.util.Scanner;

public class Z12 {
    public static void main(String[] args) {
        double x1, y1, x2, y2, res;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите значение x1: ");
        x1 = sc.nextDouble();
        System.out.println("Введите значение y1: ");
        y1 = sc.nextDouble();
        System.out.println("Введите значение x2: ");
        x2 = sc.nextDouble();
        System.out.println("Введите значение y2: ");
        y2 = sc.nextDouble();

        res = Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2));
        System.out.printf("Расстояние равно: %.2f", res);
    }
}
