package lr9.task2;

import java.util.Scanner;

public class example1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] elements = new int[5];
        int sum = 0;
        int countPositiveElements = 0;

        System.out.println("Please input elements:");
        for (int i = 0; i < 5; i++) {
            while (true) {
                try {
                    elements[i] = Integer.parseInt(scanner.next());
                    if (elements[i] > 0) {
                        sum += elements[i];
                        countPositiveElements++;
                    }
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Please input valid integer: ");
                }
            }
        }

        if (countPositiveElements == 0) {
            System.out.println("There are no positive elements in the array.");
        } else {
            double averagePositiveElements = (double) sum / countPositiveElements;
            System.out.println("Average of positive elements in the array is " + averagePositiveElements);
        }
    }
}
