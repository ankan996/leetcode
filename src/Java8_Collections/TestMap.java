package Java8_Collections;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        //TreeMap<Integer, String> treeMap = new TreeMap<>(new MyComparator());
        TreeMap<Integer, String> treeMap = new TreeMap<>(Comparator.reverseOrder());
        //TreeMap<Integer, String> treeMap = new TreeMap<>((i1,i2) -> (i1 > i2) ? -1 : (i1 < i2) ? +1 : 0);
        //TreeMap<Integer, String> treeMap = new TreeMap<>((i1,i2) -> i2.compareTo(i1));

        treeMap.put(100, "Durga");
        treeMap.put(600, "Sunny");
        treeMap.put(300, "Bunny");
        treeMap.put(200, "Chinny");
        treeMap.put(700, "Vinny");
        treeMap.put(400, "Pinny");

        System.out.println("TreeMap in descending order : " + treeMap);

        //System.out.println("------- Iterating treemap and printing the elements one by one -------");

        Set<Integer> keySet = treeMap.keySet();
        Iterator<Integer> iterator = keySet.iterator();
        while(iterator.hasNext()) {
            int key = iterator.next();
            System.out.println(key + "=" + treeMap.get(key));
        }


        }


    }

