package Set;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Linkedhashset {
    public static void main(String[] args) {
        LinkedHashSet lh1=new LinkedHashSet<String>();

        lh1.add("Stringaa");
        lh1.add("null");
        lh1.add(null);

        System.out.println(lh1);
        LinkedHashSet lh2=new LinkedHashSet<String>();
        lh2.addAll(lh1);

        System.out.println(lh1.size());

        System.out.println(lh2.contains(140));

        lh2.remove(null);
        System.out.println(lh2);

        lh1.removeAll(lh2);
        System.out.println(lh1);
        lh2.clear();
        System.out.println(lh2);
    }
}
