package EX210524abstraction;

public class crome03 extends base03 {
    @Override
    int getup() {
        System.out.println("getup time is-");
        return 6;
    }

    @Override
    int sleep() {
        System.out.println("sleeping time is -");
        return 10;
    }
}
