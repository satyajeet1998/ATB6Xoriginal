package EX250524_Exception;

public class lab05 {
    public static void main(String[] args) {
        try {
            String s="satya";
            int a=10/0;

            
            s=null;
            System.out.println(s.trim());
        } catch (NullPointerException | ArithmeticException e) {
            System.out.println("satyas");
        }
    }
}
