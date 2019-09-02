//Найти (в радианах в градусах) все углы треугольника со сторонами а, b, с.
package by.epam.jb29.task01;
import static java.lang.Math.PI;

import java.util.Scanner;

public class Z29 {
    public static void main(String[] args) {
        double a, b, c, a1, b1, y, gra1, grb1, gry;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите сторону a: ");
        a = sc.nextDouble();
        System.out.println("Введите сторону b: ");
        b = sc.nextDouble();
        System.out.println("Введите сторону с: ");
        c = sc.nextDouble();

        a1 = Math.acos((Math.pow(b, 2) + Math.pow(c, 2) - Math.pow(a, 2)) / (2 * b * c));
        b1 = Math.acos((Math.pow(a, 2) + Math.pow(c, 2) - Math.pow(b, 2)) / (2 * a * c));
        y = Math.acos((Math.pow(b, 2) + Math.pow(a, 2) - Math.pow(c, 2)) / (2 * b * a));

        gra1 = (a1 * 180) / PI;
        grb1 = (b1 * 180) / PI;
        gry = (y * 180) / PI;
        System.out.printf("Углы треуголника равны: " +
                "\na = %.2f грудусов; %.2f радиан" +
                "\nb = %.2f градусов; %.2f радиан" +
                "\ny = %.2f градусов; %.2f радиан", gra1, a1, grb1, b1, gry, y);
    }
}
