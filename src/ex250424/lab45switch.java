package ex250424;

import java.util.Scanner;

public class lab45switch {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the day1-7,will tell you what should be the date");
        int day= sc.nextInt();
        switch (day)
        {
            case 1:
                System.out.println("mon");
                break;
            case 2:
                System.out.println("tue");
                break;
            case 3:
                System.out.println("wed");
                break;
            case 4:
                System.out.println("thur");
                break;
            case 5:
                System.out.println("fri");
                break;
            case 6:
                System.out.println("sat");
                break;
            case 7:
                System.out.println("sun");
                break;
            default:
                System.out.println("out number 1-7 are allowed");
        }

    }
}
