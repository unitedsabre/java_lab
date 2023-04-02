package lr11.t3;

import java.util.Scanner;

public class task3 {
    private static Scanner in = new Scanner(System.in);
    // рекурсивный метод для ввода значений в массив
    public static void input(int[] arrays, int i) {
        if (i < arrays.length) {
            System.out.print((i + 1) + "-й элемент массива: ");
            arrays[i] = in.nextInt();
            input(arrays, i+1); // рекурсивный вызов для следующего элемента массива
        }
    }

    // рекурсивный метод для вывода массива на экран
    public static void output(int[] arrays, int i) {
        if (i < arrays.length) {
            System.out.print(arrays[i] + " ");
            output(arrays, i + 1); // рекурсивный вызов для следующего элемента массива
        }
    }
    public static void main(String[] args) {
        int[] arr = new int[5]; // размер массива - 5
        input(arr, 0); // вызываем рекурсивный метод для ввода значений в массив
        System.out.println("Получившийся массив: ");
        output(arr, 0); // выводим массив на экран с помощью рекурсии
    }

}