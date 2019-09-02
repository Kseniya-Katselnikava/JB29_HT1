//Найти площадь кольца, внутренний радиус которого равен r, а внешний — R (R> r).
package by.epam.jb29.task01;
import java.util.Scanner;
import static java.lang.Math.PI;

public class Z23 {
    public static void main(String[] args) {
        double r , R, S;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите внутренний радиус: ");
        r = sc.nextDouble();
        System.out.println("Введите внешний радиус: ");
        R = sc.nextDouble();
        if (R > r) {
            S = PI * (Math.pow(R, 2) - Math.pow(r, 2));
            System.out.printf("Площадь кольца равна: %.2f", S);
        }
        else {
            System.out.println("Внешний радиус не может быть меньше внутреннего.");
        }
    }
}
