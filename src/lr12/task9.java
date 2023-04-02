package lr12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class task9 {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("Hello, World!");
        strings.add("abc123");
        strings.add("Java");
        strings.add("Hello");

        List<String> filteredStrings = filterStrings(strings);
        System.out.println(filteredStrings);
    }

    public static List<String> filterStrings(List<String> strings) {
        List<String> filteredStrings = new ArrayList<>();

        for (String str : strings) {
            if (str.matches("[a-zA-Z]+")) { // Проверяем, содержит ли строка только буквы
                filteredStrings.add(str);
            }
        }

        return filteredStrings;
    }
}