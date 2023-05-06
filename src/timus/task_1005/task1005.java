package timus.task_1005;

import java.util.Arrays;
import java.util.Scanner;

public class task1005 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] w = new int[n];

        int sum = 0;
        for (int i = 0; i < n; i++) {
            w[i] = in.nextInt();
            sum += w[i];
        }

        boolean[] dp = new boolean[sum / 2 + 1];
        Arrays.fill(dp, false);
        dp[0] = true;

        for (int i = 0; i < n; i++) {
            for (int j = sum / 2; j >= w[i]; j--) {
                dp[j] |= dp[j - w[i]];
            }
        }

        int minDiff = sum;
        for (int i = sum / 2; i >= 0; i--) {
            if (dp[i]) {
                minDiff = sum - 2 * i;
                break;
            }
        }

        System.out.println(minDiff);
    }
}