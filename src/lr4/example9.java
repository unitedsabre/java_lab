package lr4;

import java.util.Arrays;
import java.util.Scanner;

public class example9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите текст для шифрования:");
        String text = in.nextLine();
        System.out.println("Введите ключ:");
        int key = in.nextInt();
        char mass[] = {'я', 'ф', 'й', 'ц', 'ы', 'ч', 'с', 'в',
                'у', 'к', 'а', 'м', 'и', 'п', 'е', 'н', 'р', 'т', 'ь',
                'о', 'г', 'ш', 'л', 'б', 'ю', 'д', 'щ', 'з', 'ж', 'э', 'х', 'ъ', 'ё'};
        char[] ArrayText = text.toCharArray();
        char[] CharCode = new char[ArrayText.length];
        for (int i = 0; i < ArrayText.length; i++) {
            for (int j = 0; j < mass.length; j++) {
                if (ArrayText[i] == mass[j]) {
                    CharCode[i] = mass[(j + key) % 33];
                }
            }
        }
        for (int i = 0; i < ArrayText.length; i++) {
            ArrayText[i] = (char) CharCode[i];
        }
        System.out.println(ArrayText);

        System.out.println("Выполнить обратное преобразование? (y/n)");
        boolean cool = false;
        while (!cool) {
            String otvet = in.next();
            if (otvet.equals("y")) {
                for (int i = 0; i < ArrayText.length; i++) {
                    for (int j = 0; j < mass.length; j++) {
                        if (ArrayText[i] == mass[j]) {
                            CharCode[i] = mass[(j - key) % 33];
                        }
                    }
                }
                for (int i = 0; i < ArrayText.length; i++) {
                    ArrayText[i] = (char) CharCode[i];
                }
                System.out.println(ArrayText);
                cool = true;
            } else if (otvet.equals("n")) {
                System.out.println("До свидания!");
                cool = true;
            } else {
                System.out.println("Введите корректный ответ");
                cool = false;
            }
        }
    }
}