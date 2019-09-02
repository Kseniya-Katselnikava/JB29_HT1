//Заданы координаты трех вершин треугольника (х1 у2),(х2, у2) ),(х3, у3). Найти его
//периметр и площадь.
package by.epam.jb29.task01;
import java.util.Scanner;

public class Z13 {
    public static void main(String[] args) {
        double x1, y1, x2, y2, x3, y3;
        double a, b, c, P, S, p;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите значение x1: ");
        x1 = sc.nextDouble();
        System.out.println("Введите значение y1: ");
        y1 = sc.nextDouble();
        System.out.println("Введите значение x2: ");
        x2 = sc.nextDouble();
        System.out.println("Введите значение y2: ");
        y2 = sc.nextDouble();
        System.out.println("Введите значение x3: ");
        x3 = sc.nextDouble();
        System.out.println("Введите значение y3: ");
        y3 = sc.nextDouble();

        a = Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2));
        b = Math.sqrt(Math.pow((x3-x2), 2) + Math.pow((y3-y2), 2));
        c = Math.sqrt(Math.pow((x1-x3), 2) + Math.pow((y1-y3), 2));
        P = a + b + c;
        p = P/2; // полупериметр треугольника
        S = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        System.out.printf("Периметр треугольника равен: %.2f \nПлощадь треугольника равна: %.2f", P, S);
    }
}
