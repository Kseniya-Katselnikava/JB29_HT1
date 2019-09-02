//Составить линейную программу, печатающую значение true, если указанное
//высказывание является истинным, и false — в противном случае:
//• Сумма цифр данного трехзначного числа N является четным числом.
package by.epam.jb29.task01;
import java.util.Scanner;

public class Z37p3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите трехначное число: ");
        int num = input.nextInt();

        boolean c = false;
        int sum = 0;
        while (num!=0) {
            sum += num % 10;
            num /= 10;
        }

        if (sum % 2 == 0) {
            c = true;
            System.out.println("\nСумма цифр является четным числом: " + "\n" + c);
        } else {
            System.out.println("\nСумма цифр является нечетным числом: " + "\n" + c);
        }
    }
}
