package timus.task_1880;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class task1880 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Integer> st1 = new ArrayList<Integer>();
        List<Integer> st2 = new ArrayList<Integer>();
        List<Integer> st3 = new ArrayList<Integer>();
        int a = in.nextInt();
        int count = 0;
        int a1 = a;
        while(a1 --> 0)
        {
            int n= in.nextInt();
            st1.add(n);
        }
        int b = in.nextInt();
        int b1 = b;
        while(b1 --> 0)
        {
            int n = in.nextInt();
            st2.add(n);
        }
        int c = in.nextInt();
        int c1 = c;
        while(c1 --> 0)
        {
            int n = in.nextInt();
            st3.add(n);
        }
        if(a >= b && a >= c)
        {
            for (Integer integer : st1) {
                if(st2.contains(integer)&& st3.contains(integer))
                    count++;
            }
        }
        else if(b >= a && b >= c)
        {
            for (Integer integer : st2) {
                if(st1.contains(integer)&& st3.contains(integer))
                    count++;
            }
        }
        else if(c >= b && c >= a)
        {
            for (Integer integer : st3) {
                if(st2.contains(integer)&& st2.contains(integer))
                    count++;
            }
        }
        System.out.println(count);
    }
}