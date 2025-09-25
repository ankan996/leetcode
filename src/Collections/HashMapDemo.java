package Collections;

import java.util.*;
import java.util.Map.Entry;

public class HashMapDemo {
    public static void main(String[] args) {

        HashMap<String, Integer> hm = new HashMap<String, Integer>();

        hm.put("chiranjeevi", 700);
        hm.put("balaiah", 800);
        hm.put("venkatesh", 200);
        hm.put("nagarjuna", 500);
        hm.put(null,null);

        System.out.println("Map Representation = " + hm);
        System.out.println(hm.put("chiranjeevi", 1000));

        Set<String> s = hm.keySet();
        System.out.println("The Keys are :: " + s);

        Collection<Integer> c = hm.values();
        System.out.println("The values are :: " + c);

        Set<Entry<String, Integer>> s1 = hm.entrySet();
        System.out.println("Set Representation = " + s1);

        // iterator concept

        Iterator itr = s1.iterator();
        while (itr.hasNext()) {
            Map.Entry m1 = (Map.Entry)itr.next();
            System.out.println(m1.getKey() + " : " + m1.getValue());
            if (m1.getKey().equals("balaiah")) {
                m1.setValue(1000);
            }
        }

        //System.out.println(hm);

        //Map m = Collections.synchronizedMap(hm);
        //System.out.println(m);
    }


}


