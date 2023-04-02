package lr11.t6;

import java.util.HashMap;

public class task6 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<Integer, String>();

        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.put(4, "four");
        map.put(5, "five");
        map.put(6, "six");
        map.put(7, "seven");
        map.put(8, "eight");
        map.put(9, "nine");
        map.put(10, "ten");

        String result = "";
        int product = 1;
        for (int key : map.keySet()) {
            String value = map.get(key);
            if (key > 5) {
                System.out.println(value);
            } else if (key == 0) {
                result += value + ",";
            }
            if (value.length() > 5) {
                product *= key;
            }
        }

        if (result.endsWith(",")) {
            result = result.substring(0, result.length() - 1);
            System.out.println(result);
        }

        System.out.println(product);
    }
}