package lr1;

import java.util.Scanner;

public class example13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите первое число:");
        int a = in.nextInt();

        System.out.println("Введите второе число:");
        int b = in.nextInt();

        b = a + b;

        System.out.println("Получилось " + b);
        in.close();

    }
}
