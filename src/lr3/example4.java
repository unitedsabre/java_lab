package lr3;

import java.util.Scanner;

//Напишите программу, в которой пользователем вводится два целых числа.
// Программа выводит все целые числа — начиная с наименьшего (из двух введенных чисел)
// и заканчивая наибольшим (из двух введенных чисел).
// Предложите разные версии программы (с использованием разных операторов цикла).
public class example4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите два числа:");
        int x = in.nextInt();
        int y = in.nextInt();
        int a = x;
        int b = y;

        System.out.println("Через while");
        if (x > y) {
            while (y <= x) {
                System.out.println(y);
                y++;
            }
        } else {
            while (x <= y) {
                System.out.println(x);
                x++;
            }
        }

        System.out.println("Через for");
        if (a > b) {
            for (int b1 = b; b1 <= a; b1++ ) {
                System.out.println(b1);
            }
        } else {
            for (int a1 = a; a1 <= b; a1++) {
                System.out.println(a1);
            }
        }
    }
}
