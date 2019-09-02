//Три сопротивления R1 R2, и R3 соединены параллельно. Найдите сопротивление
//соединения.
package by.epam.jb29.task01;
import java.util.Scanner;

public class Z30 {
    public static void main(String[] args) {
        double R1, R2, R3, Res;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите сторону a: ");
        R1 = sc.nextDouble();
        System.out.println("Введите сторону b: ");
        R2 = sc.nextDouble();
        System.out.println("Введите сторону с: ");
        R3 = sc.nextDouble();
        Res = 1 / ((1 / R1) + (1 / R2) + (1 / R3));

        System.out.println("Сопротивление соединения равно: " + Res);
    }
}
