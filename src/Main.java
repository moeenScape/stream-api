import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        // Example data
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve", "Eve");
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Map example: Convert names to uppercase
        List<String> upperCaseNames = names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println("Mapped Names to Uppercase: " + upperCaseNames);

        // FlatMap example: Split names into letters and flatten the result
        List<String> letters = names.stream()
                .flatMap(name -> Stream.of(name.split("")))
                .collect(Collectors.toList());
        System.out.println("Flattened Letters: " + letters);

        // ForEach example: Print all names
        names.stream()
                .forEach(System.out::println);

        // Filter example: Filter even numbers
        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("Even Numbers: " + evenNumbers);

        // Reduce example: Sum of all numbers
        int sum = numbers.stream()
                .reduce(0, (a, b) -> a + b);
        System.out.println("Sum of Numbers: " + sum);

        // Collect example: Collect distinct names
        List<String> distinctNames = names.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println("Distinct Names: " + distinctNames);

        // Sort example: Sort numbers in descending order
        List<Integer> sortedNumbers = numbers.stream()
                .sorted((a, b) -> b.compareTo(a))
                .collect(Collectors.toList());
        System.out.println("Sorted Numbers (Descending): " + sortedNumbers);

        // Max example: Find the maximum number
        int maxNumber = numbers.stream()
                .max(Integer::compareTo)
                .orElse(0);
        System.out.println("Max Number: " + maxNumber);

        // Min example: Find the minimum number
        int minNumber = numbers.stream()
                .min(Integer::compareTo)
                .orElse(0);
        System.out.println("Min Number: " + minNumber);

        // AnyMatch example: Check if any name starts with "A"
        boolean anyStartsWithA = names.stream()
                .anyMatch(name -> name.startsWith("A"));
        System.out.println("Any Name Starts with 'A': " + anyStartsWithA);

        // AllMatch example: Check if all names have length greater than 3
        boolean allLongerThanThree = names.stream()
                .allMatch(name -> name.length() > 3);
        System.out.println("All Names Longer than 3 characters: " + allLongerThanThree);

        // NoneMatch example: Check if no name is empty
        boolean noneEmpty = names.stream()
                .noneMatch(String::isEmpty);
        System.out.println("No Empty Names: " + noneEmpty);

        // FindFirst example: Find the first name starting with "C"
        String firstNameStartingWithC = names.stream()
                .filter(name -> name.startsWith("C"))
                .findFirst()
                .orElse("Not found");
        System.out.println("First Name Starting with 'C': " + firstNameStartingWithC);

        // FindAny example: Find any name starting with "D"
        String anyNameStartingWithD = names.stream()
                .filter(name -> name.startsWith("D"))
                .findAny()
                .orElse("Not found");
        System.out.println("Any Name Starting with 'D': " + anyNameStartingWithD);

        // Skip and Limit example: Skip the first 2 numbers and limit the result to 3 numbers
        List<Integer> skippedAndLimited = numbers.stream()
                .skip(2)
                .limit(3)
                .collect(Collectors.toList());
        System.out.println("Skip 2 and Limit 3: " + skippedAndLimited);

        // Concat example: Concatenate two streams
        Stream<String> firstStream = Stream.of("Hello", "World");
        Stream<String> secondStream = Stream.of("Java", "Stream");
        List<String> concatenated = Stream.concat(firstStream, secondStream)
                .collect(Collectors.toList());
        System.out.println("Concatenated Streams: " + concatenated);

        // Generate example: Generate a stream of random integers
        IntStream randomIntStream = IntStream.generate(() -> (int) (Math.random() * 100))
                .limit(5);
        randomIntStream.forEach(System.out::println);
    }
}