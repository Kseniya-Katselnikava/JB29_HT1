//Даны два числа. Найти среднее арифметическое кубов этих чисел и среднее
//геометрическое модулей этих чисел.
package by.epam.jb29.task01;
import java.util.Scanner;

public class Z17 {
    public static void main(String[] args) {
        double a, b, srAr, srGeo;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите значение a: ");
        a = sc.nextDouble();
        System.out.println("Введите значение b: ");
        b = sc.nextDouble();
        srAr = (Math.pow(a, 3) + Math.pow(b, 3)) / 2;
        srGeo = Math.sqrt(Math.abs(a) * Math.abs(b));
        System.out.printf("Среднее арифметическое чисел равно: %.2f " +
                "\nСреднее геометрическое чисел равно: %.2f", srAr, srGeo);
    }
}
