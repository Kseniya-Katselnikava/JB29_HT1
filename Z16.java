//Найти произведение цифр заданного четырехзначного числа.
package by.epam.jb29.task01;
import java.util.Scanner;

public class Z16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Пожалуйста, введите четырехзначное число: ");
        int x = sc.nextInt();
        int res = 1;

        String count = String.valueOf(x);
        boolean contains = count.contains("0");
        if (!contains) {
            for (int a = 0; a < count.length(); a++) {
                int ostatokOtDelenia = x % 10;
                if (ostatokOtDelenia == 0) {
                    x = x / 10;
                } else {
                    x = x - ostatokOtDelenia;
                    x = x / 10;
                }
               res = res * ostatokOtDelenia;
            }
            System.out.println("Произведение цифр числа равна: " + res);
        }
        else {
            System.out.println("Произведение цифр числа равна нулю");
        }
    }
}
