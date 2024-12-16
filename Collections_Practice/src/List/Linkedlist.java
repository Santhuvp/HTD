package List;

import java.util.LinkedList;
import java.util.List;

public class Linkedlist {
    public static void main(String[] args) {
        LinkedList<String> l1=new LinkedList<String>();
         l1.add("aBC");
         l1.add("efg");
         l1.add(1,"hij");
        System.out.println(l1);

        l1.get(2);
        List<String> l2=new LinkedList<String>();
        l2.addAll(l1);
        System.out.println(l2);

        System.out.println(l2.size());

        l2.remove("hij");
        System.out.println(l2);

        l2.remove(1);
        System.out.println(l2);
        System.out.println(l2.size());

        System.out.println(l1.contains("efg"));

        l1.clear();
        System.out.println(l1);


    }
}
