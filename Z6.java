//Написать код для решения задачи. В n малых бидонах 80 л молока. Сколько литров
//молока в m больших бидонах, если в каждом большом бидоне на 12 л. больше, чем в малом?
package by.epam.jb29.task01;
import java.util.Scanner;

public class Z6 {
    public static void main(String[] args) {
        int n, m;
        double b1, b2, res;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество малых бидонов: ");
        n = sc.nextInt();
        System.out.println("Введите количество больших бидонов: ");
        m = sc.nextInt();
        if (n > 0) {
            b1 = 80 / n;
            b2 = b1 + 12;
            res = b2 * m;
            System.out.printf("Литров молока в больших бидонах: %.2f", res);
        }
        else {
            System.out.println("n должно быть больше нуля.");
        }
    }
}
