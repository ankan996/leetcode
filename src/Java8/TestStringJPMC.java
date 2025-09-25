package Java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestStringJPMC {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();


        arrayList.add("Pavan");
        arrayList.add("RaviTeja");
        arrayList.add("Chiranjeevi");
        arrayList.add("Venkatesh");
        arrayList.add("Nagarjuna");

        System.out.println(arrayList);

        // check for length >= 9

        List<String> result1 = arrayList.stream().filter(i -> (i.length() > 9)).collect(Collectors.toList());
        System.out.println("Length > 9 : " + result1);

        // convert all the objects to upper case
        List<String> result2 = arrayList.stream().map(i -> i.toUpperCase()).collect(Collectors.toList());
        System.out.println("Printing in upper case : " + result2);

        // convert all the objects to lower case
        List<String> result3 = arrayList.stream().map(i -> i.toLowerCase()).collect(Collectors.toList());
        System.out.println("Printing in lower case : " + result3);

        // get the count of objects where the count is > 9

        Long count = arrayList.stream().filter(i -> (i.length() > 9)).count();
        System.out.println(count);

        // print all elements present inside the arraylist object using forEach()

        // using lambda expression
        System.out.println("using lambda expression : ");
        arrayList.stream().forEach(s -> System.out.println(s));

        // using method reference
        System.out.println("using method reference : ");
        arrayList.stream().forEach(System.out::println);

    }
}