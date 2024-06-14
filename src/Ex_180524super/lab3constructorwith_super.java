package Ex_180524super;

public class lab3constructorwith_super {
    public static void main(String[] args) {
        tiger obj=new tiger();


    }

}
class animal
{
    animal()
    {
        System.out.println("i am a animal");
    }
    animal(String type)
    {
        System.out.println("aggresive");
    }
}
class tiger extends animal {


    tiger()
    {
        //this we cant use in simultant.
        super("bengal");//it will match the parameter and print inside all data in 19 field.
        System.out.println("satya");

    }


}

