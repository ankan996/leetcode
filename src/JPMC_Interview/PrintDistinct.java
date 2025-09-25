package JPMC_Interview;

import java.util.ArrayList;
import java.util.List;

public class PrintDistinct {

    public static void main(String[] args) {

        List<Integer> object = new ArrayList<Integer>();

        object.add(1);
        object.add(2);
        object.add(3);
        object.add(1);
        object.add(2);

       object.stream().mapToInt(Integer::intValue).distinct().forEach(System.out::println);


    }

}
