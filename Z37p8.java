//Составить линейную программу, печатающую значение true, если указанное
//высказывание является истинным, и false — в противном случае:
//• Заданное число N является степенью числа а (показатель степени может находиться
//в диапазоне от 0 до 4).
package by.epam.jb29.task01;
import java.util.Scanner;

public class Z37p8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите число a: ");
        int a = input.nextInt();
        int res;
        int stepen = 0;
        System.out.println("Введите число N: ");
        int N = input.nextInt();
        boolean flag = false;
        while (stepen < 5) {
            res = (int)Math.pow(a, stepen);
            if (res == N) {
                flag = true;
                break;
            }
            stepen++;
        }
        if (flag) {
            System.out.println(flag);
        }
        else {
            System.out.println(flag);
        }
    }
}
