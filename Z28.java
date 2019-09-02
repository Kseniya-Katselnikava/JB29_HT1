//Составить программу перевода радианной меры угла в градусы, минуты и секунды.
package by.epam.jb29.task01;
import java.util.Scanner;
import static java.lang.Math.PI;

public class Z28 {
    public static void main(String[] args) {
        double rad, gr, drob, sec;
        int min, gr1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите значение радиана: ");
        rad = sc.nextDouble();

        gr = (rad * 180) / PI;
        drob = (gr - (int)gr) * 60;
        gr1 = (int)gr;
        min = (int)drob;
        sec = (drob - min) *60;

//        System.out.println("В " + rad + " радианах: " +
//                        "\nГрадусов: " +  gr1 +
//                        "\nМинут: " + min +
//                        "\nСекунд: " + sec);

        System.out.printf("В " + rad + " радианах: " +
                "\nГрадусов: %d" +
                "\nМинут: %d" +
                "\nСекунд: %.2f", gr1, min, sec);
    }
}
