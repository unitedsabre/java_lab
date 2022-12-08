package lr3;

import java.util.Scanner;
// Напишите программу, в которой создается одномерный числовой массив и заполняется числами,
// которые при делении на 5 дают в остатке 2 (числа 2,7,12,17 и так далее).
// Размер массива вводится пользователем.
// Предусмотреть обработку ошибки, связанной с вводом некорректного значения.
public class example6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Размер массива:");
        if (in.hasNextInt()) {
            int razner = in.nextInt();
            if (razner > 0) {
                int[] nums = new int[razner];
                int x = 0;
                int i = 0;
                while (x < razner) {
                    i++;
                    if (i % 5 == 2) {
                        nums[x] = i;
                        System.out.println("Элемент массива " + x + " = " + nums[x]);
                        x++;
                    }
                }
            } else {
                System.out.println("Некорректное значенние");
            }
        } else {
            System.out.println("Некорректное значенние");
               }
        }
    }
