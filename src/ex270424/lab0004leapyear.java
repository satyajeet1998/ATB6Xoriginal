package ex270424;

import java.util.Scanner;

public class lab0004leapyear {

      public static void main(String[]args)
        {


        Scanner sc=new Scanner(System.in);
        int year= sc.nextInt();
        if((year%4==0 && year%100!=0) || (year % 400==0))
        {
            System.out.println("leapyear");
        }
        else
        {
            System.out.println("not a leap year");
        }

    }
}
//if((year%4==0 &&year%100!=0)||year%400==0)(leap)
//if(num>0)||else (negative num)
//if(num1>num2)&&(num1>num3)(num1isargest
//if(num2>num1)&&(num2>num1)(num2isargest) ||ealse num3 is largest
//char ch=sc.next().chartAT(0)
//if(ch='a'||ch='e'||ch='i'||ch='o'||ch='u')

