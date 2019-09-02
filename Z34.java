//Дана величина А, выражающая объем информации в байтах. Перевести А в более
//крупные единицы измерения информации.
package by.epam.jb29.task01;
import java.util.Scanner;

public class Z34 {
    public static void main(String[] args) {
        double A;
        int a  = (int)Math.pow(2, 10);
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество байтов: ");
        A = sc.nextDouble();
        A /= a;
        System.out.printf("\nКбайт: %.4f", A);
        A /= a;
        System.out.printf("\nМбайт:%.4f", A);
        A /= a;
        System.out.printf("\nГбайт: %.4f", A);
        A /= a;
        System.out.printf("\nTбайт: %.4f", A);
    }
}
