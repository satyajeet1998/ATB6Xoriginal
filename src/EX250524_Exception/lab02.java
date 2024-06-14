package EX250524_Exception;

public class lab02 {
    public static void main(String[] args) {
        try {
            String name=null;
            name.trim();
        } catch (Exception e) {
            System.out.println("satya");
        }
        System.out.println("i am done");
    }
}
