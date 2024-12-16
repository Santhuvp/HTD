package Maps;


import java.util.TreeMap;

public class Treemap {
    public static void main(String[] args) {
        TreeMap tm=new TreeMap<>();
        tm.put(544,"Sam");
        tm.put(544,"Sam");
        tm.put(549,"Rocjy");
        tm.put(541,"Rocjy");
        tm.put(512,"Ram");
        System.out.println(tm);

        System.out.println(tm.get(512));

        System.out.println(tm.containsKey(512));
        System.out.println(tm.containsValue("Rocky"));

        System.out.println(tm.size());

        tm.remove(541);
        System.out.println(tm);

        //ceilingKey(key): Returns the least key greater than or equal to the specified key, or null if there is no such key.
        System.out.println(tm.ceilingEntry(541));

        //floorKey(key): Returns the greatest key less than or equal to the specified key, or null if there is no such key.
        System.out.println(tm.floorEntry(549));

        //higherKey(key): Returns the least key strictly greater than the specified key, or null if there is no such key.
        System.out.println(tm.higherKey(500));

        //lowerKey(key): Returns the greatest key strictly less than the specified key, or null if there is no such key.
        System.out.println(tm.lowerKey(545));
    }
}
