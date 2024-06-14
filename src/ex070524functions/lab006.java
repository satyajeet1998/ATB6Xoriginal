package ex070524functions;

public class lab006 {
    static int Hi(int a, int b)
    {
        return a+b;
    }
    static String bye(String a, String b)
    {
        return a+b;
    }

    public static void main(String[] args) {
        int r1=Hi(4,6);
        System.out.println(r1);
        String name=bye("satya","atis");
        System.out.println(name);
    }
}
