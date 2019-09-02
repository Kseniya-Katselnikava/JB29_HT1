//Вычислить периметр и площадь прямоугольного треугольника по длинам а и b двух
//катетов.
package by.epam.jb29.task01;
import java.util.Scanner;

public class Z11 {
    public static void main(String[] args) {
        double a, b, P, S;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите значение a: ");
        a = sc.nextDouble();
        System.out.println("Введите значение b: ");
        b = sc.nextDouble();
        P = a + b + Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        S = (a * b) / 2;
        System.out.printf("Периметр треугольнка равен: %.2f", P);
        System.out.printf("\nПлощадь треугольнка равна: %.2f", S);
    }
}
