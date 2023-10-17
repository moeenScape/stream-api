package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class map {
    public static List<Integer> getNumberByMap(List<Integer> numbers) {
        return numbers.stream().map(map::apply).collect(Collectors.toList());
    }

    public static List<Integer> getStringLength() {
        System.out.println("");
        System.out.println("Word are : ");
        List<String> words = Arrays.asList("apple", "banana", "cherry");
        words.forEach(word->{
            System.out.print(" ");
            System.out.print(word);
        });
        return words.stream()
                .map(String::length)
                .toList();
    }

    private static Integer apply(Integer number) {
        return number = number * 2;
    }
}
