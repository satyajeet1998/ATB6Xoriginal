package ex230424;

import java.util.Scanner;

public class lab40cl {
    public static void main(String[] args) {
        System.out.println("enter num 1");
        Scanner sc=new Scanner(System.in);
        int num1= sc.nextInt();
        System.out.println("enter num 2");
        int num2= sc.nextInt();
        if(num1>num2)
        {
            System.out.println("num1 is greter");
        }
        else
        {
            System.out.println("num2 is greter than num1");
        }
    }
}
