package EX250524_Exception;

public class lab06 {
    public static void main(String[] args) {
        try {
            String sh=null;
            sh.trim();
        } catch (Exception e) {
            System.out.println("i am done");
        }


    }

}
