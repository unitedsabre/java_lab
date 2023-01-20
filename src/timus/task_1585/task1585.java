package timus.task_1585;

import java.util.Scanner;

public class task1585 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        int a=0,b=0,c=0;
        for(int i=0; i<n; i++) {
            String s = in.nextLine();
            String s1 = s.substring(0,1);
            if(s1.equals("E"))
                a++;
            else if(s1.equals("M"))
                b++;
            else
                c++;
        }
        if(a>=b && a>=c)
            System.out.print("Emperor Penguin");
        else if(b>=a && b>=c)
            System.out.print("Macaroni Penguin");
        else
            System.out.print("Little Penguin");
    }
}