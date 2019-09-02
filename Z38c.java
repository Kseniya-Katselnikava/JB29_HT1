//Для данных областей составить линейную программу, которая печатает true, если точка
//        с координатами (х, у) принадлежит закрашенной области, и false — в противном случае:
package by.epam.jb29.task01;
import java.util.Scanner;

public class Z38c {
    public static void main(String[] args) {
        double  x, y;
        boolean flag = false;

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите значение x: ");
        x = sc.nextDouble();
        System.out.println("Введите значение y: ");
        y = sc.nextDouble();

        if (((Math.pow(x, 2) + Math.pow(y, 2) <= 16) && x >= 0 && y >= 0)
                || (x >= 0 && y <= 0 && (Math.pow(x, 2) + Math.pow(y, 2) <= 25))) {
            flag = true;
            System.out.println(flag);
        } else {
            System.out.println(flag);
        }
    }
}
