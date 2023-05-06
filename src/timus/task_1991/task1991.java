package timus.task_1991;

import java.util.Scanner;

public class task1991 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int unusedBombs = 0;
        int survivors = 0;
        for (int i = 0; i < n; i++) {
            int ai = in.nextInt();
            unusedBombs += ai - Math.min(ai, k);
            survivors += Math.max(0, k - ai);
        }
        System.out.println(unusedBombs + " " + survivors);
    }
}