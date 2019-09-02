//Составить линейную программу, печатающую значение true, если указанное
//высказывание является истинным, и false — в противном случае:
//• Сумма двух первых цифр заданного четырехзначного числа равна сумме двух его
//последних цифр.
package by.epam.jb29.task01;
import java.util.Scanner;

public class Z37p2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите четырехзначное число: ");
        int num = input.nextInt();
        String count = Integer.toString(num);
        int[] num1 = new int [count.length()];
        boolean c = false;

        for (int a = 0; a < count.length(); a++) {
            int reminder = num % 10;
            num1[a] = reminder;
            num = num - reminder;
            num = num / 10;
        }

        if (num1[0] + num1[1] ==  num1[2] + num1[3]) {
            c = true;
            System.out.println("\nСумма двух первых чисел равна сумме последних цифр: " + "\n" + c);
        }
        else {
            System.out.println("\nСумма двух первых чисел равна сумме последних цифр: " + "\n" + c);
        }
    }
}
