package lr9.task2;

import java.util.Scanner;

public class example2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the column number: ");
        String columnStr = scanner.nextLine();
        // Check if the input is a number
        if (!columnStr.matches("[0-9]+")) {
            System.err.println("Please enter a valid number!");
        } else {
            // Convert the input to an integer
            int column = Integer.parseInt(columnStr);
            // Search for the column number in the matrix
            // If the column doesn't exist, throw an error
            double[][] matrix = new double[0][];
            if (column < 0 || column > matrix[0].length) {
                System.err.println("Column doesn't exist!");
            } else {
                // Print the column
                for (int i = 0; i < matrix.length; i++) {
                    System.out.println(matrix[i][column]);
                }
            }
        }
    }
}