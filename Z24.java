//Найти площадь равнобедренной трапеции с основаниями а и b и углом α при большем
//основании а.
package by.epam.jb29.task01;
import java.util.Scanner;

public class Z24 {
    public static void main(String[] args) {
        double a, b, h, S, a1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите основание a: ");
        a = sc.nextDouble();
        System.out.println("Введите основание b: ");
        b = sc.nextDouble();
        if (a > b) {
            System.out.println("Введите угол при основании a: ");
            a1 = sc.nextDouble();
            if (a1 > 0 && a1 < 90 ) {
                h = (a - b) / 2 * Math.tan(Math.toRadians(a1));
                S = (a + b) / 2 * h;
                System.out.printf("Площадь трапеции равна: %.3f", S);
            }
            else {
                System.out.println("Угол должен быть больше нуля и меньше 90");
            }
        }
        else {
            System.out.println("Основание a должно быть больше основания b.");
        }
    }
}
