package Ex28052024collection;

import com.sun.source.tree.WhileLoopTree;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class lab05loop {
    public static void main(String[] args) {
        List<String> gym = new ArrayList();
        gym.add("gloves");
        gym.add("dumble");
        gym.add("bar");

        for (String str : gym)//1st way
        {
            System.out.println(str);
        }
        for (int i = 0; i < gym.size() - 2; i++) {//2nd way {
            System.out.println(gym);

        }
        Iterator itr= gym.iterator();
        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }




    }













    }

