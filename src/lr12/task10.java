package lr12;

import java.util.ArrayList;
import java.util.List;

public class task10 {
    public static List<Integer> filterList(List<Integer> inputList, int limit) {
        List<Integer> outputList = new ArrayList<>();
        for (int num : inputList) {
            if (num < limit) {
                outputList.add(num);
            }
        }
        return outputList;
    }

    public static void main(String[] args) {
        List<Integer> inputList = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int limit = 5;
        List<Integer> outputList = filterList(inputList, limit);
        System.out.println(outputList);
    }
}
