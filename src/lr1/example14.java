package lr1;

import java.util.Scanner;

public class example14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int b, c, d;

        System.out.println("Введите число:");
        int a = in.nextInt();

        b = a - 1;
        c = a + 1;
        d = a + b + c;
        d = d * d;
        System.out.println(b + ", " + a + ", "+ c + ", " + d);
        in.close();

    }
}
