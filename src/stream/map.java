package stream;

import java.util.List;
import java.util.stream.Collectors;

public class map {
    public static List<Integer> getNumberByMap(List<Integer> numbers) {
        return numbers.stream().map(map::apply).collect(Collectors.toList());
    }

    private static Integer apply(Integer number) {
        return number = number * 2;
    }
}
