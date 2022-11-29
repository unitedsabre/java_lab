package timus.task_1409;

import java.io.PrintWriter;
import java.util.Scanner;

public class task1409 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int gar = in.nextInt();
        int lar = in.nextInt();

        int banki = gar + lar -1;
        int garry = banki - gar;
        int larry = banki - lar;


        out.println(garry + " " + larry);
        out.flush();

    }
}
