package timus.task_1457;

import java.util.Scanner;

public class task1457 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double somme = 0;
        double n = in.nextLong();

        for (int i = 0; i < n; i++) {
            somme = somme + in.nextLong();
        }
        double k = somme / n;
        System.out.print((k));
    }
}