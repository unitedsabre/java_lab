package lr4;
import java.util.Arrays;
import java.util.Random;
//Напишите программу, в которой создается двумерный целочисленный массив.
// Он заполняется случайными числами. Затем в этом массиве строи и столбцы меняются местами:
// первая строка становится первым столбцом, вторая строка становиться вторым столбцом и так далее.
// Например, если исходный массив состоял из 3 строк и 5 столбцов, то в итоге
// получаем массив из 5 строк и 3 столбцов.
public class example5 {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        Random random = new Random();
        int[][] num = new int[a][b];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                num[i][j] = random.nextInt(100);
            }
        }
        for (int i = 0; i < num.length; i++) {
            System.out.println(Arrays.toString(num[i]));
        }
        System.out.println(" ");
        int[][] nums = new int[b][a];
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < a; j++) {
                nums[i][j] = num[j][i];
            }
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.println(Arrays.toString(nums[i]));
        }
    }
}