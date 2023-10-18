package stream;

import java.util.List;

public class reduce {
    public static int getSumByReduce (List<Integer> numbers) {
        int sum = numbers.stream()
                .reduce(0, (a, b) -> a + b);
        return sum;
    }
}
