package Ex28052024collection;

import java.util.ArrayList;
import java.util.List;

public class labarraylist {
    public static void main(String[] args) {
       List obj=new ArrayList<>();


List objlist=new ArrayList();
objlist.add("satya");
objlist.add(1);
objlist.add("satya2");
        System.out.println(objlist.size());
objlist.remove("satya");
        System.out.println(objlist);

        System.out.println(objlist.isEmpty());

       objlist.set(1,"satyaas");objlist.add(23);
        System.out.println(objlist);

}
}



