package EX210524abstractioncar;

public class vahan2 extends car2
{


    @Override
    void gear() {
        System.out.println("gear is ready");
    }

    @Override
    void accident() {
        System.out.println("heavy accident");
    }

    @Override
    void length() {
        System.out.println("length is small");
    }

    @Override
    void highspeed() {
        System.out.println("high speed power");
    }

    @Override
    void run() {
        System.out.println("power");
    }
}
