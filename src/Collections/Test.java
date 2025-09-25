package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>(Arrays.asList(1,3,5,3,5));
        Integer firstRepeating = al.stream().filter(new HashSet<>()::add).findFirst().orElse(null);
        System.out.println(firstRepeating);
    }
}
