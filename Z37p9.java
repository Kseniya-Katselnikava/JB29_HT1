//Составить линейную программу, печатающую значение true, если указанное
//высказывание является истинным, и false — в противном случае:
//• График функции у = ах2 + bх+ с проходит через заданную точку с координатами (m,
//п).
package by.epam.jb29.task01;
import java.util.Scanner;

public class Z37p9 {
    public static void main(String[] args) {
        double a, b, c, x, y, m, n;
        boolean flag = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите значение a: ");
        a = sc.nextDouble();
        System.out.println("Введите значение b: ");
        b = sc.nextDouble();
        System.out.println("Введите значение с: ");
        c = sc.nextDouble();
        System.out.println("Введите значение x: ");
        x = sc.nextDouble();
        System.out.println("Введите значение координаты m: ");
        m = sc.nextDouble();
        System.out.println("Введите значение координаты n: ");
        n = sc.nextDouble();
        y = a * Math.pow(x, 2) + b * x + c;
        if (y == m && x == n) {
            flag = true;
            System.out.println(flag);
        }
        else {
            System.out.println(flag);
        }
    }
}


