package ex200424;

public class lab32ternary
{
    public static void main(String[] args) {
        int a=10;
        int b=23;
        int max=a<b?b:a;
        int min=b<a?a:b;
        System.out.println(max);
        System.out.println(min);
    }
}
