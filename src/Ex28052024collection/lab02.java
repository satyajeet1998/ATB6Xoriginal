package Ex28052024collection;

import java.util.List;

public class lab02 {
    public static void main(String[] args) {
       List Shoppinglist=List.of("dress","bat","pant");
        System.out.println(Shoppinglist);
        System.out.println(Shoppinglist.size());
        List score=List.of("59","90","99");
        System.out.println(score);
        List diffrentdatatype=List.of("fruits",123,"gdthe",true);//diffrent data type store but array cant
        System.out.println(diffrentdatatype);
        List duplicate=List.of(1,1,"praya","satya",true,true);//store duplicate.
        System.out.println(duplicate);//
        System.out.println(duplicate.get(2));//index print
        System.out.println(duplicate.isEmpty());//isempty use in order to chk
        duplicate.add("sdf");
      //we cant add in list of duplicate so we will use class.


    }
}
