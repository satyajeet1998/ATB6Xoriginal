package Ex_180524super;

public class lab05 {
    public static void main(String[] args) {
        parot obj=new parot();
        parot obj2=new parot("dog");
        obj2.display();

    }

}

class bird
{
    String type;
    bird()
    {
        System.out.println("Bird DC");
    }
    bird(String type)
    {
        this.type=type;
        System.out.println("parameter(parent) const calling");
    }
}
class parot extends bird
{
    String breed;
    parot()
    {
        System.out.println("Parot DC");
    }
    parot(String breed)
    {

        super("-BIRD");
        this.breed=breed;
        System.out.println("satya");
    }
    void display()
    {
        System.out.println("child variable calling-"+this.breed+",parents variable calling "+super.type);
    }
}


