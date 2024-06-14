package ex170524hierarchial;

public class truck extends vehicle{
    int speed;
    truck(int speed)
    {
        this.speed=speed;
    }
    void sped()
    {
        System.out.println("speed is"+this.speed);
    }
}
