package lr3;

import java.util.Arrays;
// Напишите программу, в которой создается одномерный символьный массив из 10 элементов.
// Массив заполняется буквами «через одну», начиная с буквы ' а ':
// то есть массив заполняется буквами 'а', 'с', ' е', 'д' и так далее.
// Отобразите массив в консольном окне в прямом и обратном порядке. Размер массива задается переменной.
public class example7 {
    public static void main(String[] args) {
        int razmer = 10;
        char simv[] = new char[razmer];
        char i = 's';
        for (int x = 0; x < razmer; i--) {
            if (i % 2 == 1) {
                simv[x] = i;
                System.out.println("Элемент " + x + " = " + simv[x]);
                x++;
            }
        }
        System.out.println("Обратный порядок");
        Arrays.sort(simv);
        for (int x = 0; x < simv.length; x++) {
            System.out.println("Элемент " + x + " = " + simv[x]);
        }
    }
}