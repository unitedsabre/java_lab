package lr12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class task2 {
    public static int[] intersection(int[] arr1, int[] arr2) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    list.add(arr1[i]);
                    break;
                }
            }
        }
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {3, 4, 5};
        int[] result = intersection(arr1, arr2);
        System.out.println(Arrays.toString(result));
    }
}