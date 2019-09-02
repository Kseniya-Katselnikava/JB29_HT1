//Написать программу, которая выводит на экран первые четыре степени числа π.
package by.epam.jb29.task01;
import static java.lang.Math.PI;

public class Z15 {
    public static void main(String[] args) {
        System.out.println("Первые четыре степени числа PI");
        double stepen;
        for (int i = 1; i <= 4; i++) {
            stepen = Math.pow(PI, i);
            System.out.printf(i + " степень числа PI = %.4f \n", stepen);
        }
    }
}
