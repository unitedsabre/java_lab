package lr12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class task4 {
    public static List<Integer> squareList(List<Integer> inputList) {
        List<Integer> result = new ArrayList<>();

        for (Integer num : inputList) {
            int square = num * num;
            result.add(square);
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> inputList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        List<Integer> result = task4.squareList(inputList);

        System.out.println(result); // [1, 4, 9, 16, 25]
    }
}

