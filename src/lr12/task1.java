package lr12;

import java.util.Arrays;

public class task1 {
    public static int[] filterEvenNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (num % 2 == 0) {
                count++;
            }
        }
        int[] evenNums = new int[count];
        int index = 0;
        for (int num : nums) {
            if (num % 2 == 0) {
                evenNums[index] = num;
                index++;
            }
        }
        return evenNums;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6};
        int[] evenNums = filterEvenNumbers(nums);
        System.out.println(Arrays.toString(evenNums));
    }
}