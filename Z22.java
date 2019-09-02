// Дано натуральное число Т, которое представляет длительность прошедшего времени в
//секундах. Вывести данное значение длительности в часах, минутах и секундах в следующей
//форме:
//ННч ММмин SSc.
package by.epam.jb29.task01;
import java.util.Scanner;

public class Z22 {
    public static void main(String[] args) {
        int a, ch, min, sec;

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        a = sc.nextInt();
        ch = a / 3600;
        min = (a - (ch * 3600)) / 60;
        sec = a - (ch * 3600) - (min * 60);
        System.out.println(ch + "ч " + min + "мин " + sec + "с.");
    }
}
