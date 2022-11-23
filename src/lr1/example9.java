package lr1;

import java.util.Scanner;

public class example9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите название месяца:");
        String mouth = in.nextLine();

        System.out.println("Введите количество дней в месяце:");
        int day = in.nextInt();

        System.out.println(mouth + " содержит " + day + " суток");
        in.close();
        
    }
}
