package lr12;

import java.util.ArrayList;
import java.util.List;

public class task8 {
    public static List<Integer> filterList(List<Integer> numbers, int threshold) {
        List<Integer> filteredList = new ArrayList<>();
        for (int number : numbers) {
            if (number > threshold) {
                filteredList.add(number);
            }
        }
        return filteredList;
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 3, 4, 7, 9, 12, 15, 18, 21);
        int threshold = 10;
        List<Integer> filteredList = filterList(numbers, threshold);
        System.out.println(filteredList); // [12, 15, 18, 21]
    }
}