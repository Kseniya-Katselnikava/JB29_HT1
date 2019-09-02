//Составить линейную программу, печатающую значение true, если указанное
//высказывание является истинным, и false — в противном случае:
//• Сумма каких-либо двух цифр заданного трехзначного натурального числа N равна
//третьей цифре.
package by.epam.jb29.task01;
import java.util.Scanner;

public class Z37p7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите трехначное число: ");
        int num = input.nextInt();
        boolean flag = false;
        int[] num1 = new int[3];

        for (int a = 0; a < 3; a++) {
            int reminder = num % 10;
            num1[a] = reminder;
            num = num - reminder;
            num = num / 10;
        }
        if (num1[0] == num1[0] + num1[1] || num1[0] == num1[1] + num1[2] || num1[0] == num1[0] + num1[2]) {
            flag = true;
            System.out.println(flag);
        }
        else {
            System.out.println(flag);
        }
    }
}
