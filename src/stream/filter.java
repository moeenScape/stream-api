package stream;

import java.util.List;
import java.util.stream.Collectors;

public class filter {

    public static List<Integer> getNumberByFilter(List<Integer> numbers) {
        return numbers.stream()
                .filter(n -> n % 2 == 0)
                .toList();
    }
}
