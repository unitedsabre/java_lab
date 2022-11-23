package lr1;

import java.util.Scanner;

public class example15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int c, d;

        System.out.println("Введите первое число");
        int a = in.nextInt();

        System.out.println("Введите второе число");
        int b = in.nextInt();

        c = a + b;
        d = a - b;

        System.out.println("Сумма " + c + " Разность " + d);
        in.close();
    }
}
