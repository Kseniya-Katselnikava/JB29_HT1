//Дано значение a. Не используя никаких функций и никаких операций, кроме
//умножения, получить значение а8 за три операции и а10 за четыре операции.
package by.epam.jb29.task01;
import java.util.Scanner;

public class Z27 {
    public static void main(String[] args) {
        double a, a1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите значение a: ");
        a = sc.nextDouble();
       a1 = a;

        // для а в 8 степени
        a *= a;
        a *= a;
        a *= a;
        System.out.printf("Значение а в 8 степени равно: %.2f", a);

        // для а в 10 степени
        a = a1;
        a *= a;
        a1 = a * a;
        a1 = a1 * a1;
        a = a1 * a;
        System.out.printf("\nЗначение а в 10 степени равно: %.2f", a);

    }
}
