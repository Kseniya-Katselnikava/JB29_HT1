//Дан прямоугольник, ширина которого в два раза меньше длины. Найти площадь
//прямоугольника
package by.epam.jb29.task01;
import java.util.Scanner;

public class Z7 {
    public static void main(String[] args) {
        double a, b, S; // а - длина; b - ширина
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите длину прямоугольника: ");
        a = sc.nextDouble();
       if (a > 0) {
           b = a / 2;
           S = a * b;
           System.out.printf("Площадь прямоугольника равна: %.2f", S);
       }
       else {
           System.out.println("Длина прямоугольника не может быть равна нулю или быть меньше нуля.");
       }
    }
}
