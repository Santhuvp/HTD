package List;

import java.util.Vector;

public class Vectorclass {
    public static void main(String[] args) {

        Vector<Float> v1=new Vector<>();
        v1.add(14.911F);
        v1.add(null);
        v1.add(2.01F);
        v1.add(3,3.05F);

        System.out.println(v1);

        System.out.println(v1.get(2));

        Vector<Float> v2=new Vector<>();
        v2.addAll(v1);
        System.out.println(v2);

        System.out.println(v2.contains(45.00F));

        v2.remove(null);
        System.out.println(v2);

        System.out.println(v2.containsAll(v1));

        v2.clear();
        System.out.println(v2);

    }
}
