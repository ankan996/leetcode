package JPMC_Interview;

import java.util.HashMap;
import java.util.Map;

public class Test1 {
    public static void main(String[] args) {

        String str = "Ankan".toLowerCase();
        char[] ch = str.toCharArray();
        Map<Character, Integer> object = new HashMap<>();

        for (int i = 0; i < ch.length; i++) {

            if (!(object.containsKey(ch[i]))) {
                object.put(ch[i], 1);
            } else {
                object.put(ch[i], object.get(ch[i]) + 1);
            }

        }
        System.out.println(object);

    }
}
