package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class filter {
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

    List<Integer> evenNumbers = numbers.stream()
            .filter(n -> n % 2 == 0)
            .collect(Collectors.toList());
     List<Integer> getNumbers = evenNumbers;
}
