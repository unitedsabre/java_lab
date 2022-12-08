package lr3;
import java.util.Scanner;
//Напишите программу, которая выводит последовательность чисел Фибоначчи.
// Первые два числа в этой последовательности равны 1, а каждое следующее число равно
// сумме двух предыдущих (получается по-следовательность 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89 и так далее).
// Количество чисел в последовательности вводится пользователем.
// Предложите версии программы, использующие разные операторы цикла.
public class example3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Кол-во чисел:");
        int k = in.nextInt();
        long a = 0;
        long b = 1;
        long c = 1;
        int y = k;
        long d = 0;
        long e = 1;
        long f = 1;

        System.out.println("Через while");
        while (k > 0) {
            System.out.printf("%d, ", c);
            c = a + b;
            a = b;
            b = c;
            k--;
            }

        System.out.println("\nЧерез for");
        for (int y1 = y; y1 > 0; --y1) {
                System.out.printf("%d, ", f);
                f = d + e;
                d = e;
                e = f;
            }
        }
    }

