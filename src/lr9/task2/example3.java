package lr9.task2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class example3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        byte[] numbers = new byte[size];

        for(int i = 0; i < size; i++) {
            System.out.print("Enter the " + (i + 1) + " element of the array: ");

            try {
                numbers[i] = scanner.nextByte();
            } catch(InputMismatchException e) {
                System.out.println("You have entered a string instead of a number, please try again");
                i--;
            } catch(NumberFormatException e) {
                System.out.println("The number is out of range, please try again");
                i--;
            }
        }

        int sum = 0;
        for(int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        System.out.println("The sum of the array is " + sum);
    }
}