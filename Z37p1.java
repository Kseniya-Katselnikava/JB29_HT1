//Составить линейную программу, печатающую значение true, если указанное
//высказывание является истинным, и false — в противном случае:
//• Целое число N является четным двузначным числом.
package by.epam.jb29.task01;
import java.util.Scanner;

public class Z37p1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Пожалуйста, введите число: ");
        int x = sc.nextInt();
        boolean ch = false;
        int count = 0;

        while (x!=0) {
            x /= 10;
           if (count  > 2) {
                break;
            }
            count++;
        }

        if (x % 2 == 0 && count == 2) {
            ch = true;
            System.out.println(ch);
        }
        else {
            System.out.println(ch);
        }
    }
}
