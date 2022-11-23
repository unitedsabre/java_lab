package lr1;

import java.util.Scanner;

public class example10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int b;
        b = 2022;

        System.out.println("Введите ваш год рождения:");
        int year = in.nextInt();
        b= b-year;

        System.out.println("Ваш возраст " + b);
        in.close();
    }
}
