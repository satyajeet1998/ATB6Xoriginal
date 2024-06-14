package ex270424;

import java.util.Scanner;

public class lab0001positive_negative {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num= sc.nextInt();
        if(num>0)
        {
            System.out.println("it is a positive num");
        }
        else
        {
            System.out.println("its a negative number");
        }

    }
}
