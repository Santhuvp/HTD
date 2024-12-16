package Set;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Treeset {
    public static void main(String[] args) {
        TreeSet<Double> ts=new TreeSet<Double>();
        ts.add(34.00);
        ts.add(51.93);
        //ts.add(null);
        ts.add(153.122);

        System.out.println(ts);
        TreeSet<Double> ts1=new TreeSet<>();
        ts1.addAll(ts);

        System.out.println(ts.size());

        System.out.println(ts.contains(140.045));

        //ts1.remove(null);
        System.out.println(ts1);

        ts.removeAll(ts1);
        System.out.println(ts);
        ts1.clear();
        System.out.println(ts1);

    }
}
