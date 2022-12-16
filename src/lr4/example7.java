package lr4;

import java.lang.reflect.Array;

//Напишите программу, в которой создается двумерный числовой массив
// и этот массив заполняется «змейкой»: сначала первая строка (слева направо),
// затем последний столбец (снизу вверх), вторая строка (слева направо) и так далее.
public class example7 {
    public static void main(String[] args) {
        int a = 5;
        int b = 5;
        int[][] massiv = new int[a][b];
        int h = 0;
        int t = 0;
        int z = 0;
        for (int i = 0; z < massiv.length; z++) {
            for (int j = 0; j < (massiv.length - h); j++) {
                massiv[i][j] = t;
                t++;
            }
            if (i < massiv.length - 1) {
                i++;
            }
            for (int o = a - 1; o > h; o--) {
                massiv[o][massiv[i].length - 1 - h] = t;
                t++;
            }
            h++;
        }
        int x = 0;
        for (int i = 0; i < massiv.length; i++) {
            int count = i + 1;
            System.out.print(count + ": ");
            for (int j = 0; j < massiv[i].length; j++) {
                System.out.print(massiv[i][j] + " ");
                x++;
            }
            System.out.println();
            x = 0;
        }
    }
}