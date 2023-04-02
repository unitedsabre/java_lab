package lr12;

import java.util.ArrayList;
import java.util.List;

public class task6 {
    public static List<Integer> findDivisible(List<Integer> list, int divisor) {
        List<Integer> result = new ArrayList<>();
        for (int num : list) {
            if (num % divisor == 0) {
                result.add(num);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(25);
        nums.add(30);
        nums.add(35);
        nums.add(40);

        List<Integer> divisibleBy5 = findDivisible(nums, 2);
        System.out.println(divisibleBy5); // Output: [10, 25, 30, 35]
    }
}