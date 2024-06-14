package ex170524singleinheritance;

public class java extends lab01programming {
    String feature;
    java()
    {
        System.out.println("java is best");
    }
    java(String feature)
    {
        this.feature=feature;
    }
    void print()
    {
        System.out.println("feature is "+this.feature);
    }

}
