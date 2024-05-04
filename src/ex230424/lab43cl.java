package ex230424;


import java.util.Scanner;

public class lab43cl {
    public static void main(String[] args) {
        System.out.println("first side");
        Scanner sc=new Scanner(System.in);
        int side1= sc.nextInt();
        System.out.println("second side");

        int side2= sc.nextInt();
        System.out.println("third side");

        int side3= sc.nextInt();
        if((side1==side2) && (side2==side3) && (side3==side1))
        {
            System.out.println("equilateral");

        }
        else if((side1==side2) ||(side2==side3)||(side3==side1))
        {
            System.out.println("isol");
        }
        else
        {
            System.out.println("scalence");
        }
    }
}
