package timus.task_1493;

import java.util.Scanner;

public class task1493 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String ticketNumber = in.nextLine();
        int firstSum = ticketNumber.charAt(0) + ticketNumber.charAt(1) + ticketNumber.charAt(2) - 3 * '0';
        int secondSum = ticketNumber.charAt(3) + ticketNumber.charAt(4) + ticketNumber.charAt(5) - 3 * '0';
        if (Math.abs(firstSum - secondSum) == 1) {
            String prevTicket = decrementTicket(ticketNumber);
            String nextTicket = incrementTicket(ticketNumber);
            int prevFirstSum = prevTicket.charAt(0) + prevTicket.charAt(1) + prevTicket.charAt(2) - 3 * '0';
            int prevSecondSum = prevTicket.charAt(3) + prevTicket.charAt(4) + prevTicket.charAt(5) - 3 * '0';
            int nextFirstSum = nextTicket.charAt(0) + nextTicket.charAt(1) + nextTicket.charAt(2) - 3 * '0';
            int nextSecondSum = nextTicket.charAt(3) + nextTicket.charAt(4) + nextTicket.charAt(5) - 3 * '0';
            if (isLucky(prevFirstSum, prevSecondSum) || isLucky(nextFirstSum, nextSecondSum)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        } else {
            System.out.println("No");
        }
    }
    public static boolean isLucky(int firstSum, int secondSum) {
        return Math.abs(firstSum - secondSum) == 0;
    }
    public static String decrementTicket(String ticketNumber) {
        int n = Integer.parseInt(ticketNumber) - 1;
        String result = String.format("%06d", n);
        return result;
    }
    public static String incrementTicket(String ticketNumber) {
        int n = Integer.parseInt(ticketNumber) + 1;
        String result = String.format("%06d", n);
        return result;
    }
}