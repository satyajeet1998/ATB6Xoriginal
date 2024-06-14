package EX250524_Exception;

public class lab11ex1 {
    public static void main(String[] args) {
        satya a=new satya();
        int x=a.change();
        System.out.println(x);
    }



}

class satya
{
   int a=12;
   int change() {
       try {
           System.out.println("trying to create the object");
       } catch (Exception e) {
           System.out.println("cath the exception");
           a = 20;
           return a;
       } finally {
           System.out.println("this is final value");

       }
return 24;
   }
}

