package timus.task_1545;

import java.util.Scanner;

public class task1545 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] dictionary = new String[n];
        for (int i = 0; i < n; i++) {
            dictionary[i] = in.next();
        }
        String input = in.next();
        for (String s : dictionary) {
            if (s.startsWith(input))
            {
                System.out.println(s);
            }
        }
    }
}