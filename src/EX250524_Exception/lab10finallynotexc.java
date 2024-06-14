package EX250524_Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class lab10finallynotexc {
    public static void main(String[] args) {
        FileInputStream f=null;
        try {
            f=new FileInputStream("stbwy");
        } catch (FileNotFoundException e) {
            System.out.println("file not found");
        } finally {
            if(f!=null)
            {
                try {
                    f.close();
                } catch (IOException e) {
                    System.out.println("close");
                }
            }
        }

    }
}
