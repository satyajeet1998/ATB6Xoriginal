package Ex_180524super;

public class car1 extends vehicle1 {
    int duration=25;
    car1()
    {
        System.out.println("this is my car");
    }
    void print()
    {
        System.out.println("max speed of my car"+super.duration);
        System.out.println("max speed of my car"+this.duration);

    }
}
