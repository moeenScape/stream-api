# Java Stream Interface Methods

### What Are Streams in Java?
Java streams enable functional-style operations on streams of elements. A stream is an abstraction of a non-mutable collection of functions applied in some order to the data. A stream is not a collection where you can store elements.

### Different Operations On Streams

There are two types of Operations in Streams:

    1. Intermediate Operations
    2 .Terminate Operations
<img src="https://media.geeksforgeeks.org/wp-content/uploads/20210706120537/JavaStream.png" alt="Screenshot 1">
<img src="https://github.com/moeen775/stream-api/blob/main/238.Java-streams.jpg" alt="Screenshot 1">
Source   : (https://www.geeksforgeeks.org/java-8-stream-tutorial/) (https://s29840.pcdn.co/wp-content/uploads/2020/06/238.Java-streams.jpg) <br> <br><br>

### Example of Stream API :
```java
{
List<Integer> transactionsIds = 
    transactions.parallelStream()
                .filter(t -> t.getType() == Transaction.GROCERY)
                .sorted(comparing(Transaction::getValue).reversed())
                .map(Transaction::getId)
                .collect(toList());
}
```
<img src="https://github.com/moeen775/stream-api/blob/main/2179048.jpg" alt="Screenshot 1">
<img src="https://github.com/moeen775/stream-api/blob/main/2179051.jpg" alt="Screenshot 1">
Source   : (https://www.oracle.com/technical-resources/articles/java/ma14-java-se-8-streams.html) <br> <br><br>

### 
The java.util.stream.Stream interface in Java provides a variety of methods for working with streams. While it's not
feasible to provide examples for all of them in a single response due to their number, I can give you a list of some
commonly used methods. You can explore the documentation or specific use cases for each method as needed.

Here's a list of some of the key methods available in the Stream interface:

* filter(Predicate<T> predicate) - Filters the elements of the stream based on a given predicate.
```java
{
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

List<Integer> evenNumbers = numbers.stream()
        .filter(n -> n % 2 == 0)
        .collect(Collectors.toList());

}
```
```console
output : [2, 4, 6, 8, 10]
```

* map(Function<T, R> mapper) - Transforms each element of the stream using the provided function.
```java
List<String> words = Arrays.asList("apple", "banana", "cherry");

List<Integer> wordLengths = words.stream()
        .map(String::length)
        .collect(Collectors.toList());

```
```console
output : [5, 6, 6]
```
* flatMap(Function<T, Stream<R>> mapper) - Flattens a stream of streams into a single stream.
```java
List<List<Integer>> nestedLists = Arrays.asList(
        Arrays.asList(1, 2, 3),
        Arrays.asList(4, 5),
        Arrays.asList(6, 7, 8)
        );

        List<Integer> flattenedList = nestedLists.stream()
        .flatMap(List::stream)
        .collect(Collectors.toList());

```
```console
output : [1, 2, 3, 4, 5, 6, 7, 8]
```
* forEach(Consumer<T> action) - Performs an action on each element in the stream.
```java
List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

names.stream().forEach(name -> System.out.println("Hello, " + name));

```
```console
output :
Hello, Alice
Hello, Bob
Hello, Charlie

```
* reduce(BinaryOperator<T> accumulator) - Reduces the elements of the stream to a single result based on the provided
  binary operator.
```java
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

int sum = numbers.stream()
        .reduce(0, (a, b) -> a + b);

```
```console
output : 15
```
Explanation:

- The reduce operation combines the elements of the stream into a single result.
- The identity value 0 is the initial value for the reduction (the starting value of the sum).
- The lambda expression (a, b) -> a + b specifies how to accumulate elements. It takes two parameters (a and b) and returns their sum.
- The sum is calculated as follows: 0 + 1 + 2 + 3 + 4 + 5 = 15.
- collect(Collector<T, A, R> collector) - Collects the elements of the stream into a collection or other data structure.
```java
List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

Set<String> nameSet = names.stream()
        .collect(Collectors.toSet());

```
```console
output : [Alice, Bob, Charlie]
```
* count() - Returns the count of elements in the stream.
```java
List<String> words = Arrays.asList("apple", "banana", "cherry", "date");

long count = words.stream().count();
System.out.println("Count of words: " + count);

```
```console
output : Count of words: 4

```
Explanation:

- The count() terminal operation is applied to the stream of strings (words).
- It returns the count of elements in the stream, which represents the number of words in the list.
- The result is printed using System.out.println.

  
* distinct() - Returns a stream with distinct elements.
```java
List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 4, 4, 5);

List<Integer> distinctNumbers = numbers.stream().distinct().collect(Collectors.toList());
System.out.println("Distinct numbers: " + distinctNumbers);

```
```console
output : [1, 2, 3, 4, 5]
```
* sorted() - Returns a stream with elements sorted in their natural order.

```java
List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 9);

List<Integer> sortedNumbers = numbers.stream()
        .sorted()
        .collect(Collectors.toList());
System.out.println(sortedNumbers);
```

```console
output1 : [1, 2, 5, 8, 9]
```
#### Another Example
```java
List<String> fruits = Arrays.asList("apple", "date", "cherry", "banana");

List<String> sortedFruits = fruits.stream().sorted().collect(Collectors.toList());
System.out.println("Sorted fruits: " + sortedFruits);
```
```console
output2 : [apple, banana, cherry, date]
```
* min(Comparator<T> comparator) - Finds the minimum element in the stream based on the provided comparator.
```java
List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 9);

Optional<Integer> minNumber = numbers.stream().min(Integer::compare);
minNumber.ifPresent(min -> System.out.println("Minimum number: " + min));

```
```console
output : 1
```
* max(Comparator<T> comparator) - Finds the maximum element in the stream based on the provided comparator.
```java
List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 9);

Optional<Integer> maxNumber = numbers.stream().max(Integer::compare);
maxNumber.ifPresent(max -> System.out.println("Maximum number: " + max));

```
```console
output : 9
```
* anyMatch(Predicate<T> predicate) - Checks if any elements in the stream match a given condition.
```java
List<Integer> numbers = Arrays.asList(1, 20, 12, 8, 25);

boolean anyGreaterThan10 = numbers.stream().anyMatch(number -> number > 10);
System.out.println("Any number greater than 10? " + anyGreaterThan10);

```
```console
output : Any number greater than 10? true
```
Explanation:

- The anyMatch terminal operation is applied to the stream of integers (numbers).
- The lambda expression number -> number > 10 checks if any element in the stream is greater than 10.
- In the given list [1, 20, 12, 8, 25], there are numbers (20, 12, 25) that are greater than 10.-
- The result, which is a boolean indicating whether any element is greater than 10, is printed using System.out.println. In this case, it is true.
* allMatch(Predicate<T> predicate) - Checks if all elements in the stream match a given condition.
```java
List<Integer> numbers = Arrays.asList(15, 20, 12, 18, 25);

boolean allGreaterThan10 = numbers.stream().allMatch(number -> number > 10);
System.out.println("All numbers greater than 10? " + allGreaterThan10);

```
```console
output :All numbers greater than 10? true
```
* noneMatch(Predicate<T> predicate) - Checks if none of the elements in the stream match a given condition.
```java
List<Integer> numbers = Arrays.asList(15, 20, 12, 18, 25);

boolean noneLessThan5 = numbers.stream().noneMatch(number -> number < 5);
System.out.println("No number less than 5? " + noneLessThan5);

```
```console
No number less than 5? true
```
* findFirst() - Returns the first element of the stream, if any.
```java
List<String> words = Arrays.asList("apple", "banana", "cherry", "date");

Optional<String> firstWord = words.stream().findFirst();
firstWord.ifPresent(word -> System.out.println("First word: " + word));

```
```console
output : First word: apple
```
* findAny() - Returns any element of the stream, if any.
```java
List<String> words = Arrays.asList("apple", "banana", "cherry", "date");

Optional<String> anyWord = words.stream().findAny();
anyWord.ifPresent(word -> System.out.println("Any word: " + word));

```
```console
output : Any word: apple
```
* skip(long n) - Skips the first n elements of the stream.
```java
List<String> words = Arrays.asList("apple", "banana", "cherry", "date");

List<String> skippedWords = words.stream().skip(2).collect(Collectors.toList());
System.out.println("Words after skipping 2: " + skippedWords);

```
```console
output: Words after skipping 2: [cherry, date]
```
Explanation:

- The skip intermediate operation is applied to the stream of strings (words).
- It skips the first 2 elements of the stream.
- The remaining elements are collected into a new list using collect(Collectors.toList()).
- The result, which is the list of words after skipping 2, is printed using System.out.println. In this case, it is [cherry, date].
* limit(long maxSize) - Limits the stream to the first maxSize elements.
```java
List<String> words = Arrays.asList("apple", "banana", "cherry", "date");

List<String> limitedWords = words.stream().limit(2).collect(Collectors.toList());
System.out.println("Limited to 2 words: " + limitedWords);

```
```console
output: Limited to 2 words: [apple, banana]
```

* distinct() - Returns a stream of distinct elements.
```java
List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 4, 4, 5);

List<Integer> distinctNumbers = numbers.stream().distinct().collect(Collectors.toList());
System.out.println("Distinct numbers: " + distinctNumbers);

```
```console
output : [1, 2, 3, 4, 5]
```
* concat(Stream<T> a, Stream<T> b) - Concatenates two streams into a single stream.
```java
Stream<Integer> stream1 = Stream.of(1, 2, 3);
Stream<Integer> stream2 = Stream.of(4, 5, 6);

Stream<Integer> combinedStream = Stream.concat(stream1, stream2);
combinedStream.forEach(System.out::println);

```
```console
output : [1, 2, 3, 4, 5, 6]
```
* Stream.generate(Supplier<T> s) : The Stream.generate(Supplier<T> s) method is used to create a new stream where the elements are generated by invoking the provided Supplier function. It repeatedly calls the supplier to generate elements for the stream until a termination condition is met. The Supplier is responsible for generating elements on-the-fly.
```java
 Supplier<Integer> numberSupplier = () -> (int) (Math.random() * 100);

        // Create a stream that generates 5 random numbers
        Stream<Integer> randomNumbers = Stream.generate(numberSupplier).limit(5);

        randomNumbers.forEach(System.out::println);
```
```console
output :
42
17
89
5
71
```
These are just some of the many methods available in the Stream interface. Depending on your specific use case, you
would choose the appropriate methods to process and manipulate the data in your streams.
