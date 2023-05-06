package timus.task_1581;

import java.util.Scanner;

public class task1581 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++)
            array[i] = in.nextInt();
        int cont = 0, num;
        num = array[0];
        for (int i = 0; i < n; i++) {
            if (array[i] == num) {
                cont = cont + 1;
            }
            if (array[i] != num) {
                System.out.printf("%d %d ", cont, num);
                num = array[i];
                cont = 1;
            }
        }
        System.out.printf("%d %d", cont, num);
    }
}