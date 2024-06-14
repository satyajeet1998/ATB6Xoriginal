package ex210524interface;

public class car implements engine{

    @Override
    public void startengine() {
        System.out.println("engine start");
    }

    @Override
    public void pressbreak() {
        System.out.println("stop the car");
    }
}
