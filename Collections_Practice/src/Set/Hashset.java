package Set;

import java.util.HashSet;

public class Hashset {
    public static void main(String[] args) {
        HashSet h1=new HashSet<Integer>();
        h1.add(1);
        h1.add(null);
        h1.add(144);

        System.out.println(h1);
        HashSet h2=new HashSet<Integer>();
        h2.addAll(h1);

        System.out.println(h1.size());

        System.out.println(h2.contains(140));

        h2.remove(null);
        System.out.println(h2);

        h1.removeAll(h2);
        System.out.println(h1);
        h2.clear();
        System.out.println(h2);


    }
}
