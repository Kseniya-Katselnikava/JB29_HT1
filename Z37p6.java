// Составить линейную программу, печатающую значение true, если указанное
//высказывание является истинным, и false — в противном случае:
//• Треугольник со сторонами а,b,с является равнобедренным.
package by.epam.jb29.task01;
import java.util.Scanner;

public class Z37p6 {
    public static void main(String[] args) {
        double a, b, c;
        boolean flag = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите значение стороны a: ");
        a = sc.nextDouble();
        System.out.println("Введите значение стороны b: ");
        b = sc.nextDouble();
        System.out.println("Введите значение стороны c: ");
        c = sc.nextDouble();
        if (a == b && b == c && a == c) {
            flag = true;
            System.out.println(flag);
        }
        else {
            System.out.println(flag);
        }
    }
}
