package lr1;

import java.util.Scanner;

public class example12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;
        a = 2022;

        System.out.println("Ваш возраст:");
        int age = in.nextInt();

        a = a - age;

        System.out.println("Ваш год рождения " + a);
        in.close();

    }
}
