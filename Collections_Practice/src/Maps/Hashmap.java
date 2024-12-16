package Maps;

import java.util.HashMap;

public class Hashmap {
    public static void main(String[] args) {
        HashMap hm=new HashMap<>();
        hm.put(544,"Sam");
        hm.put(549,"Rocjy");
        hm.put(541,"Rocjy");
        hm.put(512,"Ram");
        System.out.println(hm);

        System.out.println(hm.get(512));

        System.out.println(hm.containsKey(512));
        System.out.println(hm.containsValue("Rocky"));

        System.out.println(hm.size());

        hm.remove(541);
        System.out.println(hm);


    }
}
