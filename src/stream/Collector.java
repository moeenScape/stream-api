package stream;

import java.util.List;
import java.util.stream.Collectors;

public class Collector {

    public static void getCollection(List<Integer> integers) {
        integers.stream().collect(Collectors.toList());
    }
}
