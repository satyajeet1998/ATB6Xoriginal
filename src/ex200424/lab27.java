package ex200424;

public class lab27 {
    public static void main(String[] args) {
        String pass="Satya12";
        String pas=pass.toLowerCase();
        System.out.println(pas);
        System.out.println(pass==pas);
        System.out.println(pass.equals(pas));
        System.out.println(pass.equalsIgnoreCase(pas));//we are ignoring the cap n lower just validate the content
    }
}
