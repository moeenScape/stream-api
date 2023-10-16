import stream.filter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.print("Before Filter : ");
        numbers.forEach(number->{
            System.out.print(" ");
            System.out.print(number);
        });
        System.out.println();
        System.out.print("After Filter Even Number : ");
        filter.getNumberByFilter(numbers);
    }
}