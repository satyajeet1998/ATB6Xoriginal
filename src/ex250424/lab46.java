package ex250424;

import java.util.Scanner;

public class lab46 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the browser");
        String web= sc.nextLine();
        switch (web)
        {
            case "chrome" :
                System.out.println("strting with chome");
            break;
            case "firfox" :
                System.out.println("strting with firefox");

                break;
            case "edge":
                System.out.println("strting with edge");
                break;
            default:
                System.out.println("web is strating");
                break;
            }

        }


}
