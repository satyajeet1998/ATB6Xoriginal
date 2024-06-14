package ex170524singleinheritance;

public class lab01programming {
    int version;
    String type;
    float fee;
    lab01programming()
    {
        System.out.println("satya");
    }
    lab01programming(int version,String type,float fee)
    {
        this.version=version;
        this.type=type;
        this.fee=fee;
    }
    void printgh()
    {
        System.out.println("version is-"+ this.version+"type is"+this.type+"fee is"+this.fee);
    }
}
