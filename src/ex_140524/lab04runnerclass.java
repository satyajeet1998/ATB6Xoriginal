package ex_140524;

public class lab04runnerclass {
    public static void main(String[] args) {
        lab04prameterise satya=new lab04prameterise("dudul",4755982123l);
        lab04prameterise ratul=new lab04prameterise("raka",58557852l);
        System.out.println(satya.name);
        System.out.println(ratul.name);
        System.out.println(satya.phn);
        System.out.println(ratul.phn);
        satya.raka();
    }
}
