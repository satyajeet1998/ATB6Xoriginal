package ex070524functions;

public class lab008 {
    static void hi()
    {
        System.out.println("satya");
    }

    static void hellow(String name)
    {
        System.out.println("name is"+name);
    }
    static int say(int a,int b)
    {
        return a+b;

    }
    static void ram(int a,int b)
    {
        System.out.println(a+b);
    }

    public static void main(String[] args) {
        hi();
        hellow("sat");
        int h=say(5,6);
        System.out.println(h);
        ram(9,5);
    }


}
