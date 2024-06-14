package ex270424;
public class lab00014evenodd {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if(i%2==0)
            {
                System.out.println("even"+i);
                continue;
            }
            System.out.println("odd"+i);
        }
    }
}

//for(i=1;i<=10;i++)
//if(i%2==0)
//sout(even)
//continue apply in order to stopthe loop and again execute the if block for even and failthen execute below ststement.
