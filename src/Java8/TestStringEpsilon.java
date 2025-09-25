package Java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class TestStringEpsilon {

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(
                "Pavan", "RaviTeja", "Chiranjeevi", "Venkatesh", "Nagarjuna"
             ));

        System.out.println(arrayList);

        // check for length >= 9
        arrayList.stream().filter(i -> i.length() >9).collect(Collectors.toList()).forEach(System.out::println);

        // convert all the objects to upper case
        arrayList.stream().map(i-> i.toUpperCase()).collect(Collectors.toList()).forEach(System.out::println);

        // convert all the objects to lower case
        arrayList.stream().map(i-> i.toLowerCase()).collect(Collectors.toList()).forEach(System.out::println);

        // get the count of objects where the count is > 9
        long count = arrayList.stream().filter(i-> i.length()>9).count();
        System.out.println(count);

        // print all elements present inside the arraylist object using forEach()

        // using lambda expression
        arrayList.stream().forEach(s -> System.out.println(s));


        // using method reference
        arrayList.stream().forEach(System.out::println);
    }


}
