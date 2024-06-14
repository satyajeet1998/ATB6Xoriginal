package ex070524functions;

import java.util.Scanner;

public class lab009 {
    static int sum(int a, int b)
    {
        return a+b;
    }
    static String name(String n,String n2)
    {
        return n+n2;
    }
    static void sub()
    {
        System.out.println("substarck");
    }

    public static void main(String[] args) {

        int n=sum(8,9);
        System.out.println(n);
        String z=name("satya","jeet");
        System.out.println(z);




    }
}
