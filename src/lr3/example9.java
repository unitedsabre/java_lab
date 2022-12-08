package lr3;
import java.util.Random;
import java.util.Scanner;
// Напишите программу, в которой создается массив и заполняется случайными числами.
// Массив отображается в консольном окне. В этом массиве необходимо
// определить элемент с минимальным значением. В частности, программа должна
// вывести значение элемента с минимальным значением и индекс этого элемента.
// Если элементов с минимальным значением несколько, должны быть выведены индексы всех этих элементов.
public class example9 {
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
        int[] min_ind = new int[razmer];
        int[] min_num = new int[razmer];
        int min = num[0];
        for (int y = 0; y < 2; y++) {
            for (int x = 0; x < num.length; x++) {
                if (min >= num[x]) {
                    min_ind[x] = x;
                    min = num[x];
                    min_num[x] = num[x];
                } else {
                    min_ind[x] = 0;
                    min_num[x] = 0;
                }
            }
        }
        for (int k = 0; k < num.length; k++) {
            if (min_num[k] == min && min_ind[k] != 0) {
                System.out.println("Мин. эл. массива " + min_ind[k] + " = " + min_num[k]);
            }
        }
    }
}