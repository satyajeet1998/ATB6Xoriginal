package Ex_180524super;

public class runner1 {
    public static void main(String[] args) {
        car1 obj=new car1();//if u extend the car to vehicle then it will call parent default constructor as well(super is invisible here)
        obj.print();

    }
}
