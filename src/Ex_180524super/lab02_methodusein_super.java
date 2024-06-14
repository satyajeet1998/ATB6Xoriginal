package Ex_180524super;

public class lab02_methodusein_super {
    public static void main(String[] args) {
        student obj=new student();
        obj.study();
    }

}
class teacher{
    int age=65;
    teacher()
    {
        System.out.println("everyone good in study");
    }
    teacher(int age)
    {
        this.age=age;
    }
    void message()
    {
        System.out.println("he is a good person");
    }
}
class student extends teacher
{
    int age=45;
    student()
    {
        System.out.println("everyone good in cricket");
    }
    void message()
    {
        System.out.println("my teacher");
    }
    void study()
    {
        //this.message();
        super.message();//super use in method and variable.
        System.out.println("age is-"+ super.age);
        System.out.println("age is-"+ this.age);
    }
}
