package EX250524_Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class lab03 {
    public static void main(String[] args) {
        try {
            FileInputStream f= new FileInputStream("dtheyeh63");
            System.out.println(f);//checked exception
        } catch (FileNotFoundException e) {
            System.out.println("satya");
        }
    }
}
