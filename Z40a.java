//Дано значение х. Получить значения -2х + 3х2 - 4х3 и 1 + 2х + 3х2 + 4х3 . Позаботьтесь об экономии операций.
package by.epam.jb29.task01;

public class Z40a {
    public static void main(String[] args) {
        int x = 3;
        int y = x * (-2 + x * (3 - 4 * x));
        System.out.println(y);
    }
}
