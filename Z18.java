//Дана длина ребра куба. Найти площадь грани, площадь полной поверхности и объем
//этого куба.
package by.epam.jb29.task01;
import java.util.Scanner;

public class Z18 {
    public static void main(String[] args) {
        double a, SGran, SKyb, V;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите длину ребра куба: ");
        a = sc.nextDouble();
        SGran = Math.pow(a, 2);
        SKyb = SGran*6;
        V = Math.pow(a, 3);
        System.out.printf("Площадь грани равна: %.2f " +
                "\nПлощадь куба равна: %.2f" +
                "\nОбъем куба равен: %.2f", SGran, SKyb, V);
    }
}
