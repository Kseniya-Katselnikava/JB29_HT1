//Даны натуральные числа М и N. Вывести старшую цифру дробной части и младшую
//цифру целой части числа M/N.
package by.epam.jb29.task01;
import java.util.Scanner;

public class Z35 {
    public static void main(String[] args) {
        double M, N, dr ;
        int stB, mlB;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите числитель: ");
        M = sc.nextInt();
        System.out.println("Введите знаменатель: ");
        N = sc.nextInt();
        dr = M / N;
        System.out.println(dr);
        String count = String.valueOf(dr);
        int index = count.indexOf('.');
        char[] arr = count.toCharArray();
        int[] chCh = new int[index];
        int[] drCh = new int[count.length() - index - 1];
        int i = 0;
        for (int a = 0; a < arr.length; a++) {
            if (a < index) {
                chCh[a] = Character.getNumericValue(arr[a]);
            }
            if (a > index) {
                drCh[i] = Character.getNumericValue(arr[a]);
                i++;
            }
        }
        mlB = chCh[0];
        stB = drCh[drCh.length-1];
        System.out.println("Младшая цифра целой части числа равна: " + mlB +
                "\nСтаршая цифра дробной части равна: " + stB);
    }
}

