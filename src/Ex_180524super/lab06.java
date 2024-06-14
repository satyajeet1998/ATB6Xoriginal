package Ex_180524super;

public class lab06 {
    public static void main(String[] args) {
        Father obj=new Father();
        Father obj1=new Father("browne");
        obj.dispaly();
    }

}
 class Gf
{
    String type;//parent variable
    Gf()
    {
        System.out.println("parent default construct");
    }
    Gf(String type)
    {
        this.type=type;
        System.out.println("parents parameterise constructor");
    }


}
class Father extends Gf
{
    String hair;//child variable
    Father()
    {
        System.out.println("child df constru");
    }
    Father(String hair)
    {
        super("parent cons calling");
        this.hair=hair;
        System.out.println("child parameterise constructor");
    }

    void dispaly()
    {
        System.out.println("parent variable caliing -"+super.type+", child variable calling -"+this.hair);
    }
}
