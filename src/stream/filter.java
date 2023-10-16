package stream;

import java.util.List;
import java.util.stream.Collectors;

public class filter {

    public static void getNumberByFilter(List<Integer> numbers) {
        List<Integer> evenNumber = numbers.stream()
                .filter(n -> n % 2 == 0)
                .toList();
        evenNumber.forEach(n -> {
            System.out.print(" ");
            System.out.print(n);
        });
    }
}
