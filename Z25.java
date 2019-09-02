// Вычислить корни квадратного уравнения ах2+ bх + с = 0 с заданными коэффициентами
//a, b и с (предполагается, что а≠0 и что дискриминант уравнения неотрицателен).
package by.epam.jb29.task01;
import java.util.Scanner;

public class Z25 {
    public static void main(String[] args) {
        double a, b, c, D, x1, x2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите значение a: ");
        a = sc.nextDouble();
        if (a != 0) {
            System.out.println("Введите значение b: ");
            b = sc.nextDouble();
            System.out.println("Введите значение с: ");
            c = sc.nextDouble();
            D = Math.pow(b, 2) - (4 * a * c);
//            System.out.println(D);
          if (D > 0) {
                   x1 = (-1 * b + Math.sqrt(D)) / (2 * a);
                   x2 = (-1 * b - Math.sqrt(D)) / (2 * a);
                   System.out.printf("Решения выражения: " +
                           "\n x1 = %.2f" +
                           "\n x2 = %.2f", x1,x2);
           } else if (D < 0) {
              System.out.println("Уравнение не имеет корней");
          } else if (D == 0) {
              x1 = (-1 * b) / (2 * a);
              System.out.printf("Решения выражения: " +
                      "\n x = %.2f", x1);
          }
        }
        else {
            System.out.println("а не должен быть равен нулю.");
        }
    }
}
