package ex230424;

import java.util.Scanner;

public class lab41 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1= sc.nextInt();
        if(num1>20)
        {
            System.out.println("he is good");

        }
        else if (num1<20)
        {
            System.out.println("she is inmature");

        }
        else
        {
            System.out.println("she is a kid");
        }
    }
}
