//Вычислить значение выражения по формуле (все переменные принимают
//действительные значения):
//𝑏 + √𝑏2 + 4𝑎𝑐
//2𝑎
//− 𝑎3𝑐 + 𝑏−2
package by.epam.jb29.task01;
import java.util.Scanner;

public class Z8 {
    public static void main(String[] args) {
        double a, b, c, result;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите значение a:" );
        while (!sc.hasNextDouble()){
            sc.next();
        }
        a = sc.nextDouble();
        if (a != 0) {
            System.out.println("Введите значение b:");
            while (!sc.hasNextDouble()) {
                sc.next();
            }
            b = sc.nextDouble();
            System.out.println("Введите значение c:");
            while (!sc.hasNextDouble()) {
                sc.next();
            }
            c = sc.nextDouble();
            double koren = Math.sqrt(Math.pow(b, 2) + 4*a*c);
//            System.out.println(koren);
            if (koren >= 0) {
                result =  ((b + koren) / (2 * a)) - (Math.pow(a, 3) * c) + 1/(Math.pow(b, 2));
                System.out.printf("Результат равен: %.4f", result);
            }
            else {
                result = Double.NaN;
                System.out.println("Результат равен: " + result);
            }
        }
        else {
            System.out.println("Делить на ноль нельзя!");
        }
    }
}
