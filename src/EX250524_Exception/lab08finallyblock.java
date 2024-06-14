package EX250524_Exception;

public class lab08finallyblock {
    //finally block is block of code always associated with try and catch block and it always executed wheather an exception is thrown or caugh.
    public static void main(String[] args) {
        try {
            int a=10/0;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("satya");
        }
    }
}
