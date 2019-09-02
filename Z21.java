//Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой
//частях). Поменять местами дробную и целую части числа и вывести полученное значение
//числа.
package by.epam.jb29.task01;
import java.util.Scanner;

public class Z21 {
    public static void main(String[] args) {
        double a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число в формате nnn,ddd: ");
        a = sc.nextDouble();
        boolean flag = true;
        if (a < 0) {
          a = Math.abs(a);
          flag = false;
        }
            int cheloe = (int) a;
            double drobnoe = (a - cheloe) * 1000;
            int drobnoe1 = (int) drobnoe;
            String temp = Integer.toString(cheloe);
            String temp1 = Integer.toString(drobnoe1).concat(".").concat(temp);
         if (flag) {
             double res = Double.parseDouble(temp1);
             System.out.println(res);
         }
         else {
             double res = -1 * Double.parseDouble(temp1);
             System.out.println(res);
         }
    }
}
