package lr2;
/*
Напишите программу, которая проверяет, сколько тысяч во введенном пользователем числе
(определяется четвертая цифра справа в десятичном представлении числа)
 */
import java.util.Scanner;

public class example5 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите число:");
        int num = in.nextInt();
        int res;

        if (num / 1000 != 0) {
            res = num / 1000;
            System.out.println("Тысяч в числе: " + res);
        } else {
            System.out.println("В числе нет тысяч");
        }
    }
}
