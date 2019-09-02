//Найдите значение функции: с = 3 + а.
package by.epam.jb29.task01;
import java.util.Scanner;

public class Z2 {
    public static void main(String[] args) {
        double a, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите значение а: ");
        a = sc.nextDouble();
        c = 3 + a;
        System.out.printf("Значение с равно: %.2f", c);
    }
}
