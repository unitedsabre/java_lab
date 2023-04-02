package lr11.t2;

import java.util.Scanner;
public class task2 {

    public static String convert(int decNum) {
        if (decNum == 0) {
            return "0";
        }
        if (decNum == 1) {
            return "1";
        }
        int b = decNum % 2;
        int c = decNum / 2;
        return convert(c) + b;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int a = in.nextInt();
        in.close();

        String num = convert(a);
        System.out.println(a + " в двоичной системе счисления: " + num);
    }
}
