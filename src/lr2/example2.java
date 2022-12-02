package lr2;

import java.util.Scanner;

public class example2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите число:");
        int num = in.nextInt();

        if (num % 5 == 2)
            System.out.println("Ваше число делиться на 5 и в остатке 2");
        else
            System.out.println("Ваше число делиться на 5, но остатке не 2");
        if (num % 7 == 1)
            System.out.println("Ваше число делиться на 7 и в остатке 1");
        else
            System.out.println("Ваше число делиться на 7, но остатке не 1");
        in.close();
    }
}
