//Найти площадь треугольника, две стороны которого равны а и b, а угол между этими
//сторонами у.

// под вопросом???
package by.epam.jb29.task01;
import java.util.Scanner;
import static java.lang.Math.PI;

public class Z26 {
    public static void main(String[] args) {
        double a, b, y, S;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите сторону a: ");
        a = sc.nextDouble();
        System.out.println("Введите сторону b: ");
        b = sc.nextDouble();
        System.out.println("Введите угол между этими сторонами y: ");
        y = sc.nextDouble();
        S = (a * b) / 2 * Math.sin(Math.toRadians(y));
        System.out.printf("Площадь треугольника равна: %.2f", S);
    }
}
