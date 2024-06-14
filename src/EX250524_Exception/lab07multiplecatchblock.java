package EX250524_Exception;

public class lab07multiplecatchblock {
    public static void main(String[] satya) {
        try {
           String sh=satya[0];
            int a=Integer.parseInt(satya[0]);
            int x=10/a;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("value is right for numb");
        }
        catch (ArithmeticException e)
        {
            System.out.println("value will be different");
        }
        catch (NumberFormatException e)
        {
            System.out.println("value will be number");
        }

    }
}
