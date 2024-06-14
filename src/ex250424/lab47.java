package ex250424;

import java.util.Scanner;

public class lab47 {
    public static void main(String[] args) {
        System.out.println("enter a character and will tell if it  isa vowel or  not");
        Scanner sc=new Scanner(System.in);
        char input=sc.next().charAt(0);
        switch (input)
        {
            case 'a':
                System.out.println("vowel");
                break;
            case 'e':
                System.out.println("vowel");
                break;
            case 'i':
                System.out.println("vowel");
                break;
            case 'o':
                System.out.println("vowel");
                break;
            case 'u':
                System.out.println("vowel");
                break;
            default:
                System.out.println("normal alphabet");
        }
    }
}
