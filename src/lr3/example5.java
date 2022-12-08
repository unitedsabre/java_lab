package lr3;
import java.util.Random;
import java.util.Scanner;
// Напишите программу, в которой вычисляется сумма чисел, удовлетворяющих таким критериям:
// при делении числа на 5 в остатке получа-ется 2,
// или при делении на 3 в остатке получается 1.
// Количество чисел в сумме вводится пользователем.
// Программа отображает числа, которые суммируются, и значение суммы.
// Предложите версии программы, использующие разные операторы цикла.
public class example5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите кол-во чисел в сумме:");
        int x = in.nextInt();
        int y = 0;
        Random random = new Random();
        int a = x;
        int z = 0;

        System.out.println("Через while");
        while (x > 0) {
            int ran = random.nextInt(100);
            if (ran % 5 == 2 || ran % 3 == 1) {
               System.out.println(ran);
                y = y + ran;
                x--;
            }
        }
        System.out.println("Сумма чисел = " + y);

        System.out.println("Через for");
        for (int i = 0; a > 0; i++) {
            if (i % 5 == 2 || i % 3 == 1) {
                System.out.println(i);
                z = z + i;
                a--;
            }
        }System.out.println("Сумма чисел = " + z);
    }
}