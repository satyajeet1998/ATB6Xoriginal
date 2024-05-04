package ex200424;

public class lab16 {
    public static void main(String[] args) {
        String name="satya";//= assignment operator
        System.out.println("your name  is->"+name);
        String name2=new String("satya");//new keyword
        //both of them save the value in jvm
        //they are different from each other
        System.out.printf("\n your  name is %s",name);

        System.out.println(name.length());
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        //learning is primitive data type does not have any extra functionality  example-stones bricks can not be broken
        //non primitive can be break like string class array object.
        //java is not purelyobject oriented
        //due to primitive data type does not follow class.
    }
}
