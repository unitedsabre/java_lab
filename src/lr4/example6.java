package lr4;

import java.util.Arrays;
import java.util.Random;

//Напишите программу, в которой создается и инициализируется двумерный числовой массив.
// Затем из этого массива удаляется строка и столбец
// (создается новый массив, в котором по сравнению с исходным удалена одна строка и один столбец).
// Индекс удаляемой строки и индекс удаляемого столбца определяется с помощью генератора случайных чисел.
public class example6 {
    public static void main(String[] args) {
        Random random = new Random();
        int a = 3;
        int b = 3;
        int[][] massiv = new int[a][b];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                massiv[i][j] = random.nextInt(100);
            }
        }
        for (int i = 0; i < massiv.length; i++) {
            System.out.println(Arrays.toString(massiv[i]));
        }
        int dela = random.nextInt(a - 1);
        int delb = random.nextInt(b - 1);
        System.out.println("Удаленная строка = "+ dela) ;
        System.out.println("Удаленная столбец = " + delb);
        System.out.println();

        int[][] massiv2 = new int[a - 1][b - 1];
        for (int i = 0, s = 0; i < a - 1; s++) {
            if (s != dela) {
                for (int j = 0, k = 0; j < b - 1; k++) {
                    if (k != delb) {
                        massiv2[i][j] = massiv[s][k];
                        j++;
                    }
                }
                i++;
            }
        }
        for (int i = 0; i < massiv2.length; i++) {
            System.out.println(Arrays.toString(massiv2[i]));
        }
    }
}