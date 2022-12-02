package lr2;

import java.util.Scanner;

public class example1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите число:");
        int num = in.nextInt();

        if (num % 3 == 0)
            System.out.println("Число число делиться на три");
        else
            System.out.println("Число не делиться на три");

        in.close();
    }
}
