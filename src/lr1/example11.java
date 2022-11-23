package lr1;

import java.util.Scanner;

public class example11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;
        a = 2022;

        System.out.println("Введите Ваше имя:");
        String name = in.nextLine();

        System.out.println("Введите Ваш год рождения:");
        int age = in.nextInt();

        a = a - age;

        System.out.println("Ваше имя " + name + " " + "и ваш возвраст " + a);
        in.close();

    }
}
