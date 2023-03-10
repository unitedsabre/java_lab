package lr9.task2;

import java.util.Scanner;

public class example2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the column number: ");
        String columnStr = scanner.nextLine();
        if (!columnStr.matches("[0-9]+")) {
            System.err.println("Please enter a valid number!");
        } else {
            int column = Integer.parseInt(columnStr);
            double[][] matrix = new double[0][];
            if (column < 0 || column > matrix[0].length) {
                System.err.println("Column doesn't exist!");
            } else {
                for (int i = 0; i < matrix.length; i++) {
                    System.out.println(matrix[i][column]);
                }
            }
        }
    }
}