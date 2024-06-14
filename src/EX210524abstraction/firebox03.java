package EX210524abstraction;

public class firebox03 extends base03{

    @Override

    int getup() {

        System.out.println("get up time is-");
        return 7;
    }

    @Override
    int sleep() {
        System.out.println("sleeping time -");
        return 11;
    }
}
