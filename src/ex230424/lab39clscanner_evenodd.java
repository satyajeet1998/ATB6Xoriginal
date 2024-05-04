package ex230424;

import java.util.Scanner;

public class lab39clscanner_evenodd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("take a number and check is it a odd or even");
        int num= sc.nextInt();
        if(num%2==0)
        {

            System.out.println("this is even");
        }
        else
        {
            System.out.println("this is odd");
        }
    }
}
