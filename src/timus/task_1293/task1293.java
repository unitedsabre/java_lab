package timus.task_1293;
import java.util.Scanner;

public class task1293 {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int N = in.nextInt();
            int A = in.nextInt();
            int B = in.nextInt();

            int result = (N * (A*B)) * 2;

            System.out.println(result);
        }
    }