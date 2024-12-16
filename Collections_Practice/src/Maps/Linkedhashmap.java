package Maps;

import java.util.LinkedHashMap;

public class Linkedhashmap {
    public static void main(String[] args) {
        LinkedHashMap lhm=new LinkedHashMap<>();
        lhm.put(544,"Sam");
        lhm.put(549,"Rocjy");
        lhm.put(541,"Rocjy");
        lhm.put(512,"Ram");
        System.out.println(lhm);

        System.out.println(lhm.get(512));

        System.out.println(lhm.containsKey(512));
        System.out.println(lhm.containsValue("Rocky"));

        System.out.println(lhm.size());

        lhm.remove(541);
        System.out.println(lhm);

        lhm.clear();
        System.out.println(lhm);

    }
}
