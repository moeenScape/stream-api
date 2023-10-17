import stream.filter;
import stream.flatmap;
import stream.map;

import java.util.Arrays;
import java.util.List;

import static stream.map.getStringLength;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.print("Before Filter : ");
        display.displayNumber(numbers);
        System.out.println(" ");
        System.out.print("After Filter Even Number : ");
        display.displayNumber(filter.getNumberByFilter(numbers));
        System.out.println(" ");
        System.out.print("Before map : ");
        display.displayNumber(numbers);
        System.out.println(" ");
        System.out.print("After Map Number : ");
        display.displayNumber(map.getNumberByMap(numbers));
        System.out.print("Length of word : ");
        display.displayNumber(getStringLength());
        System.out.print("After Flat Map : ");
        display.displayNumber(flatmap.getNumberAfterFlatMap());
    }
}