//Составить алгоритм нахождения среднего арифметического двух чисел
package by.epam.jb29.task01;
import java.util.Scanner;

public class Z5 {
    public static void main(String[] args) {
        double a, b, sredArifm;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите значение a: ");
        a = sc.nextInt();
        System.out.println("Введите значение b: ");
        b = sc.nextInt();
        sredArifm = (a + b) / 2;
        System.out.printf("Значение с равно: %.2f", sredArifm);
    }
}
