package Collections;
import java.util.Collection;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class Test1 {

    public static void main(String[] args) {


        ConcurrentHashMap<String, Integer> obj = new ConcurrentHashMap<>();
        //Map<String, Integer> obj = new HashMap<>();

        obj.put("Neeraj", 1);
        obj.put("Mahesh", 2);

        obj.replace("Neeraj", 2, 2);

        System.out.println(obj);

    }


}
