package Java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestStringJPMCHYD {
    public static void main(String[] args) {

        List<String> arrayList = new ArrayList<>(List.of(
                "Pavan",
                "RaviTeja",
                "Chiranjeevi",
                "Venkatesh",
                "Nagarjuna"
                ));

        System.out.println(arrayList);

        // check for length >= 9
        arrayList.stream().filter(s -> s.length() > 9).collect(Collectors.toList()).forEach(System.out::print);
        System.out.println();
        // convert all the objects to upper case
        List<String> strUC = arrayList.stream().map(s->s.toUpperCase()).collect(Collectors.toList());
        System.out.println(strUC);
        // convert all the objects to lower case
        List<String> strLC = arrayList.stream().map(s->s.toLowerCase()).collect(Collectors.toList());
        System.out.println(strLC);

        // get the count of objects where the count is > 9
        Long count = arrayList.stream().filter(s->s.length() > 9).count();
        System.out.println(count);
        // print all elements present inside the arraylist object using forEach()

        // using lambda expression

        // using method reference



    }
}
