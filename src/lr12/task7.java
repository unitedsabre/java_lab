package lr12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class task7 {
    public static List<String> filterStrings(List<String> strings, int length) {
        List<String> filteredStrings = new ArrayList<String>();
        for (String s : strings) {
            if (s.length() > length) {
                filteredStrings.add(s);
            }
        }
        return filteredStrings;
    }

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("hello", "world", "java", "program");
        List<String> filteredStrings = filterStrings(strings, 5);
        System.out.println(filteredStrings);
    }
}
