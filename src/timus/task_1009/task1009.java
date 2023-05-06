package timus.task_1009;

import java.util.Scanner;

public class task1009 {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            int k = in.nextInt();
            int[][] dp = new int[n + 1][k];

            for (int i = 0; i < k; i++) {
                dp[1][i] = 1;
            }
            for (int i = 2; i <= n; i++) {
                for (int j = 0; j < k; j++) {
                    for (int m = 0; m < k; m++) {
                        if (j != 0 || m != 0) {
                            dp[i][j] += dp[i - 1][m];
                        }
                    }
                }
            }
            int result = 0;
            for (int i = 1; i < k; i++) {
                result += dp[n][i];
            }
            System.out.println(result);
        }
}