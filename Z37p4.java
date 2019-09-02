//Составить линейную программу, печатающую значение true, если указанное
//высказывание является истинным, и false — в противном случае:
//• Точка с координатами (х, у) принадлежит части плоскости, лежащей между прямыми
//х= т, х= п (т<п).
package by.epam.jb29.task01;
import java.util.Scanner;

public class Z37p4 {
    public static void main(String[] args) {
        double x, y, m, n;
        boolean flag = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите значение прямой m: ");
        m = sc.nextDouble();
        System.out.println("Введите значение прямой n с условием m < n: ");
        n = sc.nextDouble();
        if (m < n) {
            System.out.println("Введите значение точки по оси x: ");
            x = sc.nextDouble();
            System.out.println("Введите значение точки по оси y: ");
            y = sc.nextDouble();

            if (x >= m && x <= n){
                flag = true;
                System.out.println(flag);
            }
            else {
                System.out.println(flag);
            }
        }
        else {
            System.out.println("Усовие m < n не соблюдено.");
        }
    }
}
