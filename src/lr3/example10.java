package lr3;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
// Напишите программу, в которой создается целочисленный массив,
// заполняется случайными числами и после этого значения элементов
// в массиве сортируются в порядке убывания значений.
public class example10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Размер массива:");
        int razmer = in.nextInt();
        int[] num = new int[razmer];
        Random random = new Random();
        for (int i = 0; i < num.length; i++) {
            num[i] = random.nextInt(100);
            System.out.println("Эл. массива " + i + " = " + num[i]);
        }
        System.out.println("В порядке убывания");
        Arrays.sort(num);
        for (int i = 0; i < num.length; i++ ){
               System.out.println("Эл. массива " + i + " = " + num[i]);
        }
    }
}
