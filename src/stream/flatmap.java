package stream;

import java.util.Arrays;
import java.util.List;

public class flatmap {
    public static List<Integer> getNumberAfterFlatMap() {
        List<List<Integer>> nestedLists = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5),
                Arrays.asList(6, 7, 8)
        );

        return nestedLists.stream()
                .flatMap(List::stream)
                .toList();
    }
}
