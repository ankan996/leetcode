package jpmc.live.interview;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[] args) {
        List<Integer> listObject = new ArrayList<>();

        listObject.add(1);
        listObject.add(2);
        listObject.add(3);
        listObject.add(4);

        List<Integer> oddNumbers =
                listObject.stream().filter(i -> (i % 2) != 0).toList();

        Integer result =
                oddNumbers.stream().mapToInt(i -> (i * i)).sum();

        System.out.println(result);

    }



}
