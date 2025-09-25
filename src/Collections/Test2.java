package Collections;

import java.util.ArrayList;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {

        List<Integer> list1 = List.of(1, 2, 3, 4, 5);
        List<Integer> list2 = List.of(4, 5, 6, 7, 8);

        // Answer = [4, 5]

        ArrayList<Integer> intersection = new ArrayList<>(list1);
        intersection.retainAll(list2);

        System.out.println(intersection);

    }
}