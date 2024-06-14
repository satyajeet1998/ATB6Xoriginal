package ex270424;

import java.util.Scanner;

public class lab0002largestnumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1= sc.nextInt();
        System.out.println("entered the   num 1");
        int num2= sc.nextInt();
        System.out.println("entered the   num 2");
        int num3= sc.nextInt();
        System.out.println("entered the   num 3");
//        if (num1>=num2 &&num1>=num3)
//        {
//            System.out.println("num1 is  greater");
//        }
//        else if (num2>=num1&&num2>=num3)
//        {
//            System.out.println("num2 is  greater");
//        }
//        else
//        {
//            System.out.println("number  is greter");
//        }
       int largest= (num1>num2)?((num1>num3) ? num1 :num3 ) : ((num2>num3) ? num2:num3);
        System.out.println("Largestvalue is"+largest);
    }
}
//int largest=(num1>num3)?((num1>num3)?num1:num3):((num2>num3)?num2:num3);