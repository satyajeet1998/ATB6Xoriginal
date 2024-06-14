package ex_140524;

public class lab05runnerclass {
    public static void main(String[] args) {
        lab05bankaccount sbiref=new lab05bankaccount("SBI",14626,1254f);
        lab05bankaccount hdfcref=new lab05bankaccount("HDfc",23451,247846f);
        System.out.println(sbiref.name);
        System.out.println(sbiref.salary);
        System.out.println(sbiref.code);
        System.out.println(hdfcref.name);
        System.out.println(hdfcref.salary);
        System.out.println(hdfcref.code);



    }
}
