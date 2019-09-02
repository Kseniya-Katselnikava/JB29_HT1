//Найдите значение функции: z = ( (a – 3 ) * b / 2) + c.
package by.epam.jb29.task01;
import java.util.Scanner;

public class Z4 {
    public static void main(String[] args) {
        double a, b, c, z;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите значение a: ");
        a = sc.nextInt();
        System.out.println("Введите значение b: ");
        b = sc.nextInt();
        System.out.println("Введите значение c: ");
        c = sc.nextInt();
        z = ((a - 3) * b / 2) + c;
        System.out.printf("Значение с равно: %.2f", z);
    }
}
