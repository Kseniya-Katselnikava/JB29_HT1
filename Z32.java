//Текущее показание электронных часов: т ч (0 ≤ т ≤23) п мин (0 ≤ п ≤59) к с (0 ≤к ≤59).
//Какое время будут показывать часы через р ч q мин r с?
package by.epam.jb29.task01;
import java.util.Scanner;

public class Z32 {
    public static void main(String[] args) {
        int m, n, k, p, q, r;
        int mem = 1;
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите текущие часы: ");
        m = sc.nextInt();
        if (m >= 0 && m <= 23) {
            System.out.println("Введите текущие минуты: ");
            n = sc.nextInt();
            if (n >= 0 && n <= 59) {
                System.out.println("Введите текущие секунды: ");
                k = sc.nextInt();
                if (k >= 0 && k <= 59) {
                    System.out.println("Введите часы для расчета: ");
                    p = sc.nextInt();
                    if (p >= 0 && p <= 23) {
                        System.out.println("Введите минуты для расчета: ");
                        q = sc.nextInt();
                        if (q >= 0 && q <= 59) {
                            System.out.println("Введите секунды для расчета: ");
                            r = sc.nextInt();
                            if (r >= 0 && r <= 59) {
                                if (k + r < 60 && n + q < 60 && m + p < 24) {
                                    m = m + p;
                                    n = n + q;
                                    k = k + r;
                            }
                            else if (k + r > 59) {
                                    if (n + q < 59 && m + p < 24) {
                                        m = m + p;
                                        n = n + q + mem;
                                        k = (k + r) % 60;
                                    }
                                        else if (n + q >= 59) {
                                        k = (k + r) % 60;
                                        n = (n + q + mem) % 60;
                                        if (m + p < 23) {
                                            m = m + p + mem;
                                        } else {
                                            m = (m + p + mem) % 24;
                                        }
                                    }
                                }
                                System.out.println("Время: " + m + " ч. " + n + " мин. " + k + " сек.");
                            }
                            else {
                                System.out.println("Секунды должны быть в промежутке от 0 до 59");
                            }
                        } else {
                            System.out.println("Минуты должны быть в промежутке от 0 до 59");
                        }
                    } else {
                        System.out.println("Часы должны быть в промежутке от 0 до 23");
                    }
                }
                else {
                    System.out.println("Секунды должны быть в промежутке от 0 до 59");
                }
            } else {
                System.out.println("Минуты должны быть в промежутке от 0 до 59");
            }
        } else {
            System.out.println("Часы должны быть в промежутке от 0 до 23");
        }
    }
}
