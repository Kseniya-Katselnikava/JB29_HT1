//Ввести любой символ и определить его порядковый номер, а также указать предыдущий
//и последующий символы.
package by.epam.jb29.task01;

public class Z33 {
    public static void main(String[] args) {
        char chP, chN, a = 'a';
        int ind = a;
        int p, n;
        p = ind - 1;
        n = ind + 1;
        chP = (char)p;
        chN = (char)n;

        System.out.println("Индекс символа " + a + " = " +  ind +
                "\nПредыдущий символ: " + chP +
                "\nПоследующий символ: " + chN );
    }
}
