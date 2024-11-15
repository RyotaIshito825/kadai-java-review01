import java.util.*;
import java.util.stream.*;
public class ArithmeticExceptionSample {

    public static void main(String[] args) {

        String[] arr_1 = new String[] {"1", "2", "3", "4", "5"};

        List<Integer> list =  Arrays.stream(arr_1)
                                    .map(Integer::parseInt)
                                    .collect(Collectors.toList());

        System.out.println(list.get(0));

    }
}
