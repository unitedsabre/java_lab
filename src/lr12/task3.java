package lr12;

import java.util.ArrayList;
import java.util.List;

public class task3 {
    public static void main(String[] args) {
        // Пример списка строк
        List<String> strings = new ArrayList<>();
        strings.add("Hello");
        strings.add("world");
        strings.add("Java");
        strings.add("Programming");
        strings.add("Language");

        // Получаем новый список строк, начинающихся с заглавной буквы
        List<String> newStrings = getCapitalizedStrings(strings);

        // Выводим новый список в консоль
        System.out.println(newStrings);
    }

    public static List<String> getCapitalizedStrings(List<String> strings) {
        List<String> newStrings = new ArrayList<>();

        // Проходимся по каждой строке списка
        for (String string : strings) {
            // Если первый символ строки является заглавной буквой
            if (Character.isUpperCase(string.charAt(0))) {
                // Добавляем строку в новый список
                newStrings.add(string);
            }
        }

        return newStrings;
    }
}