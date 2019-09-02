//Найдите значение функции: z = 2 * x + ( y – 2 ) * 5.
package by.epam.jb29.task01;
import java.util.Scanner;

public class Z3 {
    public static void main(String[] args) {
        int x, y, z;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите значение x: ");
        x = sc.nextInt();
        System.out.println("Введите значение у: ");
        y = sc.nextInt();
        z = 2 * x + (y - 2) * 5;
        System.out.println("Значение z равно: " + z);
    }
}
