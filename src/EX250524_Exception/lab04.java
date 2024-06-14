package EX250524_Exception;

public class lab04 {
    public static void main(String[] args) {
        try {
            String sh = args[0];
            int x = Integer.parseInt(sh);
            int a = 10 / x;
            System.out.println(x);
            System.out.println(a);

        } catch (ArithmeticException | NumberFormatException | ArrayIndexOutOfBoundsException e) {
            System.out.println("problem");
        }
       catch (Exception e)
        {
            System.out.println("satya");
        }
    }
}
