// Найти частное произведений четных и нечетных цифр четырехзначного числа
package by.epam.jb29.task01;
import java.util.Scanner;

public class Z36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Пожалуйста, введите четырехзначное число: ");
        int x = sc.nextInt();
        int resch = 1;
        int resnech = 1;
        double chastnoe;
        boolean flagch = false;
        boolean flagnech = false;

        while (x!=0) {
            if (x % 2 == 0) {
                resch *= x % 10;
                flagch = true;
            }
            else {
                resnech *= x % 10;
                flagnech = true;
            }
            x /= 10;
        }
//        System.out.println(resch);
//        System.out.println(resnech);
        if (flagch && flagnech) {
            chastnoe = (double) resch / resnech;
            System.out.printf("Частное равно: %.3f", chastnoe);
        }
        else if (flagch && !flagnech) {
            System.out.println("В числе только четные числа." +
                    "\n Произведение четных чисел равно: " + resch);
        }
        else {
            System.out.println("В числе только нечетные числа." +
                    "\n Произведение нечетных чисел равно: " + resch);
        }
     }
}
