//Для данных областей составить линейную программу, которая печатает true, если точка с координатами (х, у)
// принадлежит закрашенной области, и false — в противном случае:
package by.epam.jb29.task01;
import java.util.Scanner;

public class Z38a {
    public static void main(String[] args) {
        double  x, y;
        boolean flag = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите значение x: ");
        x = sc.nextDouble();
        System.out.println("Введите значение y: ");
        y = sc.nextDouble();

        if ((x <= 0 && x >= -4 && y <= x + 4) || (x >= 0 && x <= 4 && y <= 4 - x)) {
            flag = true;
            System.out.println(flag);

        } else {
            System.out.println(flag);
        }
    }
}
