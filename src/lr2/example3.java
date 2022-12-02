package lr2;

import java.util.Scanner;

public class example3 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите число:");
        int num = in.nextInt();

        if (num % 4==0 && num > 10)
           System.out.println("Ваше число делиться на 4 и больше 10");
        else
           System.out.println("Ваше число неподходит");

        in.close();
    }
}
