package ex230424;

import java.util.Scanner;

public class lab42cl {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the student score");
        int score= sc.nextInt();
        if(score>=90 && score<=100)
        {
            System.out.println("grade is A");
        }
        else if(score>=80 && score<=89)
        {
            System.out.println("grade is B");
        }
        else if (score>=70 && score<=79)
        {
            System.out.println("grade is C");
        }
        else if(score>=60 && score<=69)
        {
            System.out.println("grade is D");
        }
        else
        {
            System.out.println("f");
        }
    }
}
