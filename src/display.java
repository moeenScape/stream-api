import java.util.List;

public class display {
    public static void displayNumber(List<Integer> numbers) {
        numbers.forEach(number ->{
            System.out.print(" ");
            System.out.print(number);
        });
    }
}
