package stream;

import java.util.List;

public class filter {
    public static List<Integer> getNumberByFilter(List<Integer> numbers) {
        return numbers.stream()
                .filter(n -> n % 2 == 0)
                .toList();
    }
}
