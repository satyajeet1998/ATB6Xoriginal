package EX250524_Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class lab09finallypr {
    public static void main(String[] args) {
        FileInputStream f=null;
        try {
            f=new FileInputStream("stbwy");
        } catch (FileNotFoundException e) {
            System.out.println("file.txt");
        } finally {
            System.out.println("file not found");
        }
    }
}
