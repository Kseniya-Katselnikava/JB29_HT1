//Даны два действительных числа х и у. Вычислить их сумму, разность, произведение и
//частное.
package by.epam.jb29.task01;
import java.util.Scanner;

public class Z1 {
    public static void main(String[] args) {
        int x, y, sum, razn;
        double chast;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите значение x: ");
        x = sc.nextInt();
        System.out.println("Введите значение у: ");
        y = sc.nextInt();

        sum = x + y;
        razn = x - y;
        System.out.println("Сумма равна: " + sum + "\nРазность равна: " + razn);

        if (y > 0) {
            chast = (double)x / y;
            System.out.printf("Частное равно: %.2f", chast);
        }
        else {
            System.out.println("На ноль делить нельзя.");
        }

    }
}
