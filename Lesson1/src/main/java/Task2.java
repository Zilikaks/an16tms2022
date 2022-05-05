import java.util.Arrays;

public class Task2 {

    public static void main(String[] args) {
        System.out.println("Count positive numbers = " + CountPositive(args));
    }

    private static int getCountPositive(String[] numbers) {
        return (int) Arrays.stream(numbers).mapToInt(Integer::parseInt).filter(x -> x > 0).count();
    }
}
