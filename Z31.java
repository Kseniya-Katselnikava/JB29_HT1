//Составить программу для вычисления пути, пройденного лодкой, если ее скорость в
//стоячей воде v км/ч, скорость течения реки v1 км/ч, время движения по озеру t1 ч, а против
//течения реки — t2 ч.
package by.epam.jb29.task01;
import java.util.Scanner;

public class Z31 {
    public static void main(String[] args) {
        double v, v1, t1, t2, S1, S2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите скорость в стоячей воде: ");
        v = sc.nextDouble();
        System.out.println("Введите время движения по озеру: ");
        t1 = sc.nextDouble();
        System.out.println("Введите скорость течения реки: ");
        v1 = sc.nextDouble();
        System.out.println("Введите время движения против течения: ");
        t2 = sc.nextDouble();
        S1 = v * t1;
        S2 = (v - v1) * t2;

        System.out.println("Путь пройденный лодкой по озеру равен: " + S1
                + "\nПуть пройденный лодкой против течения реки равен: " + S2);
    }
}
