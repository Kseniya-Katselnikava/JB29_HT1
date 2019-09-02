//Составить линейную программу, печатающую значение true, если указанное
//высказывание является истинным, и false — в противном случае:
//• Квадрат заданного трехзначного числа равен кубу суммы цифр этого числа.
package by.epam.jb29.task01;
import java.util.Scanner;

public class Z37p5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите трехначное число: ");
        int num = input.nextInt();
        int kvad = (int) Math.pow(num, 2);
        int sum = 0;
        boolean flag = false;
        while (num!=0) {
            sum += num % 10;
            num /= 10;
        }
        int kub = (int)Math.pow(sum, 3);
        if (kvad == kub) {
            flag = true;
            System.out.println(flag);
        }
        else {
            System.out.println(flag);
        }
    }
}
