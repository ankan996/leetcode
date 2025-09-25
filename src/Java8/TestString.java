package Java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestString {

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();


        arrayList.add("Pavan");
        arrayList.add("RaviTeja");
        arrayList.add("Chiranjeevi");
        arrayList.add("Venkatesh");
        arrayList.add("Nagarjuna");

        System.out.println(arrayList);

        // check for length >= 9

        List<String> resultString = arrayList.stream().filter(s -> s.length() >= 9).collect(Collectors.toList());
        System.out.println("Length of the String > 9 = " + resultString);

        // convert all the objects to upper case

        List<String> strToUppercase = arrayList.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
        System.out.println("Printing all the objects in upper case = " + strToUppercase);

        // convert all the objects to lower case

        List<String> strToLowercase = arrayList.stream().map(s -> s.toLowerCase()).collect(Collectors.toList());
        System.out.println("Printing all the objects in lower case = " + strToLowercase);


        // get the count of objects where the count is >= 9

        long count = arrayList.stream().filter(s -> s.length() >= 9).count();
        System.out.println("Count of objects having size >= 9 = " + count);

        System.out.println();

        // print all elements present inside the arraylist object using forEach()

        // using lambda expression
        arrayList.forEach(s -> System.out.println(s));

        System.out.println("---------- Using method reference ---------- ");
        // using method reference
        arrayList.stream().forEach(System.out::println);

    }


}
