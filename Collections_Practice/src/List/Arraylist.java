package List;

import java.util.ArrayList;
import java.util.List;

public class Arraylist
{
    public static void main(String[] args) {
        List<Integer> l1=new ArrayList<Integer>();
        l1.add(45);
        l1.add(101);
        l1.add(null);
        l1.add(71);
        l1.add(21);
        System.out.println(l1);
            List l2=new ArrayList<Integer>();
            l2.addAll(l1);
            System.out.println(l2);
            System.out.println(l1.contains(null));
            System.out.println(l1.get(0));

           l2.remove(null);
           System.out.println(l2);
           l2.add(2,null);
        System.out.println(l2);
        System.out.println(l2.indexOf(101));
        System.out.println(l2.get(4));






    }
}
